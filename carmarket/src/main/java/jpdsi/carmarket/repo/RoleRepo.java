package jpdsi.carmarket.repo;

import java.util.Optional;

import jpdsi.carmarket.model.ERole;
import jpdsi.carmarket.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}