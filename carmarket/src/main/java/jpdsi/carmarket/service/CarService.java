package jpdsi.carmarket.service;

import jpdsi.carmarket.model.Car;
import jpdsi.carmarket.repo.CarRepo;
import jpdsi.carmarket.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepo carRepo;

    @Autowired
    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Car addCar(Car car){
        return carRepo.save(car);
    }

    public List<Car> findAllCars(){
        return carRepo.findAll();
    }


    public void deleteCar(Long id){
        carRepo.deleteById(id);
    }

    public Car updateCar(Car car){
        return carRepo.save(car);
    }

    public Car findCarById(Long id){
        return carRepo.findCarById(id).get();
    }


}
