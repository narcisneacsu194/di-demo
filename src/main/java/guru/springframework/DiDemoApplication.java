package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import guru.springframework.services.ConstructorGreetingService;
import guru.springframework.services.GreetingServiceImpl;
import guru.springframework.services.PrimaryGreetingService;
import guru.springframework.services.SetterGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController)ctx.getBean("myController");

//		controller.hello();
//
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

//		ConstructorGreetingService constructorGreetingService =
//				ctx.getBean(ConstructorGreetingService.class);
//		System.out.println(constructorGreetingService.sayGreeting());
//
//		GreetingServiceImpl greetingServiceImpl =
//				ctx.getBean(GreetingServiceImpl.class);
//		System.out.println(greetingServiceImpl.sayGreeting());
//
//		PrimaryGreetingService primaryGreetingService =
//				ctx.getBean(PrimaryGreetingService.class);
//		System.out.println(primaryGreetingService.sayGreeting());
//
//		SetterGreetingService setterGreetingService =
//				ctx.getBean(SetterGreetingService.class);
//		System.out.println(setterGreetingService.sayGreeting());

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}
}
