package com.SpringBoot.SignletonNONSTATICfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Servicing {
	
	private ApplicationLogger  logger;
	
	
	 @Autowired
	public Servicing( LoggerFactory loggerfac) {
		// TODO Auto-generated constructor stub
		this.logger = loggerfac.getLogger();
	}
	
	public void process() {
        logger.log("Processing started.");
    }
	
	/*@Component: This annotation marks the class as a Spring-managed bean, allowing Spring to automatically register and inject them into other beans as dependencies.
@Autowired: This annotation tells Spring to inject the required dependencies (in this case, LoggerFactory) into the constructor.
Factory Design: The LoggerFactory is acting as a non-static factory class that provides a logger. We inject this factory into the Servicing class to get the logger and log messages.*/

}
