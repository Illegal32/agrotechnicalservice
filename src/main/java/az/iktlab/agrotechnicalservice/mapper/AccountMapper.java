package az.iktlab.agrotechnicalservice.mapper;

import az.iktlab.agrotechnicalservice.dao.model.UsersModel;
import az.iktlab.agrotechnicalservice.dto.request.AccountRequestDTO;
import az.iktlab.agrotechnicalservice.dto.response.AccountResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public UsersModel accountRequestDTOtoAccount(AccountRequestDTO requestDTO) {
        UsersModel model = new UsersModel();

        model.setUsername(requestDTO.getUsername());
        model.setEmail(requestDTO.getEmail());
        model.setPassword(requestDTO.getPassword());

        return model;
    }

    public AccountResponseDTO accountToAccountResponseDTO(UsersModel account) {
        AccountResponseDTO accountResponseDTO = new AccountResponseDTO();
        accountResponseDTO.setUsername(account.getUsername());
        accountResponseDTO.setEmail(account.getEmail());
        return accountResponseDTO;
    }
}
