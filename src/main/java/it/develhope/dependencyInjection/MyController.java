package it.develhope.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @Autowired
    public MyController() {
        System.out.println("MyController() has been created");
    }

    @GetMapping(value = "/getName")
    public String getNameService(){
        return myService.getName();
    }

    @GetMapping(value = "/")
    public void welcomeMessage(){
        System.out.println("Welcome!");
        System.out.println("MyController.welcomeMessage() has been created");
    }
}
