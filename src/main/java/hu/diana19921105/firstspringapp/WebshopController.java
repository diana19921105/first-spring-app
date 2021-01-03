package hu.diana19921105.firstspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebshopController {

    @GetMapping("/webshop")
    public String helloWorld() {
        return "Hello World!";
    }
}
