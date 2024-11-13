package com.SpringBoot.SignletonNONSTATICfactory;

import org.springframework.stereotype.Component;

@Component
public class ApplicationLogger {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}