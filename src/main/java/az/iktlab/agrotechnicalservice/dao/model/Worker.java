package az.iktlab.agrotechnicalservice.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(max = 10)
    private String name;
    @NotBlank
    @Size(max = 15)
    private String surname;
    @NotBlank
    private String age;
    @NotBlank
    @Size(max = 20)
    private String username;
    @NotBlank
    @Size(max = 20)
    private String password;
    @NotBlank
    @Size(max = 30)
    private String jobName;


}
