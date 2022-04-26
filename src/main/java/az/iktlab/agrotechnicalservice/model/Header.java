package az.iktlab.agrotechnicalservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Header {

    private String id;
    ArrayList <Object> name;
    private String size;
    private String salary;
    private String agrotechcol;

}
