package jpdsi.carmarket.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String userName;
    private String email;
    private String phone;
    private String roles;
    private String password;
    private boolean active;

    @ManyToMany
    @JoinTable(
            name = "car_watch",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id"))
    Set<Car> watchedCars;

    public User(){}

    public User(Long id, String userName, String email, String phone, String roles, String password, boolean active, Set<Car> watchedCars) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.roles = roles;
        this.password = password;
        this.active = active;
        this.watchedCars = watchedCars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Car> getWatchedCars() {
        return watchedCars;
    }

    public void setWatchedCars(Set<Car> watchedCars) {
        this.watchedCars = watchedCars;
    }
}
