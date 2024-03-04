package training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.entities.MyService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean named "myService" from the application context
		MyService myService = (MyService) context.getBean("myService");
		System.out.println(myService.getDataService());

	}

}
