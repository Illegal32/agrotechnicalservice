package az.iktlab.agrotechnicalservice.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Header {

    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    ArrayList<Object> name;
    @JsonProperty("size")
    String size;
    @JsonProperty("salary")
    String salary;
    @JsonProperty("agrotechcol")
    String agrotechcol;

}
