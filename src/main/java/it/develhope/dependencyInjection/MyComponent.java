package it.develhope.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String myComponentName;

    public MyComponent() {
        this.myComponentName = "Alessio Pollina";
        System.out.println("MyComponent() has been created");

    }

    public String getMyComponentName(){
        System.out.println("MyComponent().getMyComponentName has been created");
        return myComponentName;
    }
}
