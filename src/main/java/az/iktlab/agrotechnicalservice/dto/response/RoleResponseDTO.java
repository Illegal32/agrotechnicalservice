package az.iktlab.agrotechnicalservice.dto.response;

import az.iktlab.agrotechnicalservice.dao.model.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleResponseDTO {

    Long id;
    Role roleName;
}
