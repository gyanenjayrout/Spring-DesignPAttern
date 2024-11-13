package com.SpringBoot.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class NotificationClient {
	
	private final   NotificationFactory notificationfctory;
	
     @Autowired
	NotificationClient(NotificationFactory notificationfctory)
	{
		this.notificationfctory  =notificationfctory;
	}
     
     public void notifyUser(String type, String message) 
     {
    	 NotificationService notificationService = notificationfctory.getNotificationService(type);
    	 
    	 notificationService.sendNotification(message);
     }
}
