package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.InotificationService;

@Component
@Profile("default")
public class NotificationServiceImpl implements InotificationService {


	public void notification() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	
	

	
}
