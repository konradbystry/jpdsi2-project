package jpdsi.carmarket.repo;

import java.util.Optional;

import jpdsi.carmarket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findUserById(Long id);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    void deleteUserById(Long id);
}