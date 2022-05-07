package az.iktlab.agrotechnicalservice.mapper;

import az.iktlab.agrotechnicalservice.dao.model.Role;
import az.iktlab.agrotechnicalservice.dto.response.RoleResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResponseDTO roleToRoleResponseDTO(Role role);
}
