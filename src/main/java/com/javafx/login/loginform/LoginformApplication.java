package com.javafx.login.loginform;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javafx.application.Application;

@EnableDiscoveryClient
@SpringBootApplication
public class LoginformApplication {

	public static void main(String[] args) {
		Application.launch(JavaFxApplication.class,args);
	}

}
