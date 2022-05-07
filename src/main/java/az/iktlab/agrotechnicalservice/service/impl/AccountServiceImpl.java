package az.iktlab.agrotechnicalservice.service.impl;

import az.iktlab.agrotechnicalservice.dao.model.Roles;
import az.iktlab.agrotechnicalservice.dao.model.UsersModel;
import az.iktlab.agrotechnicalservice.dao.repository.UsersRepository;
import az.iktlab.agrotechnicalservice.dto.response.AccountResponseDTO;
import az.iktlab.agrotechnicalservice.exception.UserNotFoundException;
import az.iktlab.agrotechnicalservice.service.AccountService;
import az.iktlab.agrotechnicalservice.dao.model.Role;
import az.iktlab.agrotechnicalservice.dto.request.AccountRequestDTO;
import az.iktlab.agrotechnicalservice.exception.DuplicateFieldException;
import az.iktlab.agrotechnicalservice.mapper.AccountMapper;
import az.iktlab.agrotechnicalservice.util.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Boolean addUser(AccountRequestDTO request) {
        Validation.validateRequest(request);
        request.setPassword(encoder.encode(request.getPassword()));

        UsersModel account = accountMapper.accountRequestDTOtoAccount(request);
        if (usersRepository.existsByUsername(account.getUsername())) {
            throw new DuplicateFieldException(String.format("Username: %s is exists", account.getUsername()));
        } else if (usersRepository.existsByEmail(account.getEmail())) {
            throw new DuplicateFieldException(String.format("Email: %s is exists", account.getEmail()));
        }
        account.getRoles().add(new Role(2L, Roles.ROLE_USER));
        usersRepository.save(account);
        return true;
    }

    @Override
    public Boolean updateUser(Long id, AccountRequestDTO request) {
        UsersModel account = getAccountById(id);
        Validation.validateRequest(request);
        if (usersRepository.existsByUsername(request.getUsername())) {
            throw new DuplicateFieldException(String.format("Username: %s is exists", request.getUsername()));
        } else if (usersRepository.existsByEmail(request.getEmail())) {
            throw new DuplicateFieldException(String.format("Email: %s is exists", request.getEmail()));
        }
        account.setPassword(encoder.encode(request.getPassword()));
        account.setUsername(request.getUsername());
        account.setEmail(request.getEmail());
        usersRepository.save(account);
        return true;
    }

    @Override
    public List<AccountResponseDTO> getAllUsers() {
        return usersRepository.findAll().stream()
                .map(accountMapper::accountToAccountResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AccountResponseDTO getUserById(Long id) {
        return accountMapper.accountToAccountResponseDTO(getAccountById(id));
    }

    @Override
    public AccountResponseDTO getUserByUsername(String username) {
        return accountMapper
                .accountToAccountResponseDTO(usersRepository.findByUsername(username)
                        .orElseThrow(() -> new UserNotFoundException(String.format("User: %s Not Found", username))));
    }

    @Override
    public Boolean deleteById(Long id) {
        usersRepository.delete(getAccountById(id));
        return true;
    }

    private UsersModel getAccountById(Long id) {
        return usersRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User Not found!"));
    }
}
