package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService constructorGreetingService){
        this.greetingService = constructorGreetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
