package jpdsi.carmarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/welcomeUser")
    public String welcomeUser(){
        return "Welcome User!";
    }

    @GetMapping("/welcomeAdmin")
    public String welcomeAdmin(){
        return "Welcome Admin!";
    }
}
