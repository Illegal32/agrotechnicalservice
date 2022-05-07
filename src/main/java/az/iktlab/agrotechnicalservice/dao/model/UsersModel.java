package az.iktlab.agrotechnicalservice.dao.model;

import az.iktlab.agrotechnicalservice.dao.repository.UsersRepository;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users_table")

public class UsersModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "username", nullable = false, unique = true, length = 15)
    String username;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "email", unique = true)
    String email;

    @Column(name = "is_active", columnDefinition = "boolean default true")
    private Boolean isActive = true;

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "timestamp default now()", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "timestamp default now()", nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

    @ManyToMany(fetch = EAGER)
    Set<Role> roles = new HashSet<>();
}
