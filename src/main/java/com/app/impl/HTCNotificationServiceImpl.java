package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.InotificationService;

@Component
@Profile("HTC")
public class HTCNotificationServiceImpl implements InotificationService {

	
	public void notification() {
		System.out.println("htc only");

	}

}
