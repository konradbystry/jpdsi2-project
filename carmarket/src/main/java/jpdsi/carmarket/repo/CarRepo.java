package jpdsi.carmarket.repo;

import jpdsi.carmarket.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepo extends JpaRepository<Car, Long> {
    void deleteCarById(Long id);

    Optional<Car> findCarById(Long id);
}
