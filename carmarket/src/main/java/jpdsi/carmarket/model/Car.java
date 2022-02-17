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
    String price;

    String phone;


    String imageUrl;



    public Car(){};

    public Car(Long id, String brand, String model, String year, String distance, String engine, String power, String imageUrl, String price, String phone) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.distance = distance;
        this.engine = engine;
        this.power = power;

        this.imageUrl = imageUrl;
        this.price = price;
        this.phone = phone;
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



    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
