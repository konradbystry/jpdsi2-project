package jpdsi.carmarket.repo;

import jpdsi.carmarket.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
