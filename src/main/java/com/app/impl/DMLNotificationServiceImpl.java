package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.InotificationService;

@Component
@Profile("DML")
public class DMLNotificationServiceImpl implements InotificationService {

		public void notification() {
		System.out.println("only for DML Profiles");

	}

}
