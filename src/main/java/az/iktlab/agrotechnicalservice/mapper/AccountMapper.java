package az.iktlab.agrotechnicalservice.mapper;

import az.iktlab.agrotechnicalservice.dao.model.UsersModel;
import az.iktlab.agrotechnicalservice.dto.request.AccountRequestDTO;
import az.iktlab.agrotechnicalservice.dto.response.AccountResponseDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AccountMapper {

    UsersModel accountRequestDTOtoAccount(AccountRequestDTO requestDTO);

    AccountResponseDTO accountToAccountResponseDTO(UsersModel account);
}
