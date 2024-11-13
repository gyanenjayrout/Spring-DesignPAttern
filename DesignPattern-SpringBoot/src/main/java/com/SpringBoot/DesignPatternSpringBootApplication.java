package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBoot.Notification.NotificationClient;
import com.SpringBoot.SignletonNONSTATICfactory.LoggerFactory;
import com.SpringBoot.SignletonNONSTATICfactory.Servicing;
import com.SpringBoot.SignletonSTATICFActory.DatabaseConnection;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class DesignPatternSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DesignPatternSpringBootApplication.class, args);
		
		//Dependency Injection with Factory Method in Spring
		
		NotificationClient client = context.getBean(NotificationClient.class);
		
		client.notifyUser("Email", "please Text me  :)");
		
		/*
		  @Component: This annotation marks the class as a Spring-managed bean, allowing Spring to automatically register and inject 
		  them into other beans as dependencies.
			@Autowired: This annotation tells Spring to inject the required dependencies (in this case, LoggerFactory) into the constructor.
			Factory Design: The LoggerFactory is acting as a non-static factory class that provides a logger. We inject this factory into the Servicing class to get the logger
		 and log messages.
			 
			 */
					
		Servicing servicee = context.getBean(Servicing.class);
		
		servicee.process();
		
		
		
		/*DatabaseConnection.getInstance().connect(): In the main method of the DesignPatternSpringBootApplication class, 
		 * we call the getInstance() method of the DatabaseConnection Singleton class, which ensures that 
		 * only one instance of DatabaseConnection is created. Then, we call the connect() method to print the connection message.*/
		DatabaseConnection data=  DatabaseConnection.getInstance();
		
		data.connect();
		
	
		
		
	}

}
