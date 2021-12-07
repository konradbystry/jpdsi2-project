package jpdsi.carmarket;

import jpdsi.carmarket.model.Car;
import jpdsi.carmarket.model.User;
import jpdsi.carmarket.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarResource {

    private final CarService carService;

    public CarResource(CarService carService){
        this.carService = carService;
    }

    @PostMapping("/add")
    public ResponseEntity<Car> addUser(@RequestBody Car car){
        Car newCar = carService.addCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

}
