package az.iktlab.agrotechnicalservice.dao.repository;


import az.iktlab.agrotechnicalservice.dao.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Long> /* usersModel and id from that class*/ {

    Optional<UsersModel> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
