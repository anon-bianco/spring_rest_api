package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmpManagementApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EmpManagementApplication.class, args);
	}

}
