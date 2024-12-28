package com.alessandro.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alessandro.helpdesk.services.DBService;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("test")
public class DevConfig {
	
	@Autowired
	private DBService dbService;

	@PostConstruct
    public void instaciaDB() {
		this.dbService.instanciaDB();
	}

}
