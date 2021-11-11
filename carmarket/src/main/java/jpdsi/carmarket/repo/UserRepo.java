package jpdsi.carmarket.repo;

import jpdsi.carmarket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
