package jpdsi.carmarket.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Car implements Serializable {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    Long id;
    String brand;
    String model;
    String year;
    String distance;
    String engine;
    String power;

    @ManyToMany(mappedBy = "watchedCars")
    Set<User> watches;

    public Car(Long id, String brand, String model, String year, String distance, String engine, String power, Set<User> watches) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.distance = distance;
        this.engine = engine;
        this.power = power;
        this.watches = watches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Set<User> getWatches() {
        return watches;
    }

    public void setWatches(Set<User> watches) {
        this.watches = watches;
    }
}
