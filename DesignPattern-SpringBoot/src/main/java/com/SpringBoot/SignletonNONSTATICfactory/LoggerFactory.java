package com.SpringBoot.SignletonNONSTATICfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class LoggerFactory {
	
	private ApplicationLogger logger;
	 @Autowired
	public LoggerFactory(ApplicationLogger logger) {
		// TODO Auto-generated constructor stub
		
		this.logger = logger;
	}
	
	public ApplicationLogger getLogger() {
        return logger;
    }

}
