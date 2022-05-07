package az.iktlab.agrotechnicalservice.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AGRO_SERVICES {

    @JsonProperty("header")
    Header header;
    @JsonProperty("body")
    Body body;

    //codeBeauty.getArgoService.getBody()co

}
