//package az.iktlab.agrotechnicalservice.dao.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//import java.util.HashSet;
//
//import java.util.Set;
//
//@Data
//@Table(name = "users",
//        uniqueConstraints = {@UniqueConstraint(columnNames = "name"),
//                @UniqueConstraint(columnNames = "surname"),
//                @UniqueConstraint(columnNames = "age"),
//                @UniqueConstraint(columnNames = "username"),
//                @UniqueConstraint(columnNames = "password")})
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class Users {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @NotBlank
//    @Size(max = 10)
//    private String name;
//    @NotBlank
//    @Size(max = 20)
//    private String surname;
//    @NotBlank
//    private String age;
//    @NotBlank
//    @Size(max = 20)
//    private String username;
//    @NotBlank
//    @Size(max = 15)
//    private String password;
//
//    @ManyToMany(fetch = FetchType.EAGER)
//    private Set<Role> roles = new HashSet<>();
//
//
//}
