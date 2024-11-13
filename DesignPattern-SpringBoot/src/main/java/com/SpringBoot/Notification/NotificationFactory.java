package com.SpringBoot.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class NotificationFactory {
	
	
	private final  EmailNotificationService email;
	
	private final SMSNotificationService sms;
	
	
	@Autowired
	public NotificationFactory(EmailNotificationService email,SMSNotificationService sms) {
		// TODO Auto-generated constructor stub
		this.email =email;
		this.sms  =sms;
	}
	
	public NotificationService getNotificationService(String type)
	{
		
		
		if("Email".equalsIgnoreCase(type))
		{
			return email;
		}else if("sms".equalsIgnoreCase(type))
		{
			return sms;
		}
		 throw new IllegalArgumentException("Unknown notification type");
	}
	
	
	
	

}
