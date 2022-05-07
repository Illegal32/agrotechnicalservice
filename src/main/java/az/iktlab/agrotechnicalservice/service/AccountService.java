package az.iktlab.agrotechnicalservice.service;


import az.iktlab.agrotechnicalservice.dto.request.AccountRequestDTO;
import az.iktlab.agrotechnicalservice.dto.response.AccountResponseDTO;

import java.util.List;

public interface AccountService {
    Boolean addUser(AccountRequestDTO request);

    List<AccountResponseDTO> getAllUsers();

    AccountResponseDTO getUserById(Long id);

    AccountResponseDTO getUserByUsername(String username);

    Boolean updateUser(Long id,AccountRequestDTO accountResponse);

    Boolean deleteById(Long id);
}
