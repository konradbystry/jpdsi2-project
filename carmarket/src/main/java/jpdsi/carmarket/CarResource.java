package jpdsi.carmarket;

import jpdsi.carmarket.model.Car;
import jpdsi.carmarket.model.User;
import jpdsi.carmarket.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarResource {

    private final CarService carService;

    public CarResource(CarService carService){
        this.carService = carService;
    }

    @PostMapping("/add")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        Car newCar = carService.addCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> allCars = carService.findAllCars();
        return new ResponseEntity<>(allCars, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable("id") Long id) {
        carService.deleteCar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Car> updateCar(@RequestBody Car car){
        Car updateCar = carService.updateCar(car);
        return new ResponseEntity<>(updateCar, HttpStatus.OK);
    }

    @PostMapping("/upd/{id}")
    public ResponseEntity<Car> updUser(@PathVariable("id") Long id, @RequestBody Car car) {
        Car updCar = carService.findCarById(id);
        updCar.setBrand(car.getBrand());
        updCar.setModel(car.getModel());
        updCar.setDistance(car.getDistance());
        updCar.setEngine(car.getEngine());
        updCar.setImageUrl(car.getImageUrl());
        updCar.setPhone(car.getPhone());
        updCar.setPower(car.getPower());
        updCar.setYear(car.getYear());
        updCar.setPrice(car.getPrice());

        carService.updateCar(updCar);
        return ResponseEntity.ok(updCar);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable("id") Long id){
        Car car = carService.findCarById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }



}
