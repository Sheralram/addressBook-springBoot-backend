package com.bridgelabz.addressbookapp;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Slf4j
@EnableSwagger2
public class AddressbookAppApplication {

	public static void main(String[] args) {
        System.out.println("Welcome to Addressbook App Application");
		ApplicationContext context = SpringApplication.run(AddressbookAppApplication.class, args);

		log.info("Addressbook App Started in {} Environment",
				context.getEnvironment().getProperty("environment"));
		System.out.println(" Addressbook App Running");


	}
}
