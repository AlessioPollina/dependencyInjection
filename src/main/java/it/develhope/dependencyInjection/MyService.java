package it.develhope.dependencyInjection;

import it.develhope.dependencyInjection.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService{

    @Autowired
    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
        System.out.println("MyService() has been created");
    }


    public String getName(){
        System.out.println("MyService.getName() has been created");
        return myComponent.getMyComponentName();
    }

}
