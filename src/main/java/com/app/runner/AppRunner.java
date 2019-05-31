package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.app.service.InotificationService;

public class AppRunner implements CommandLineRunner {

	@Autowired
	private InotificationService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter into in runn");
		service.notification();
		
	}

}
