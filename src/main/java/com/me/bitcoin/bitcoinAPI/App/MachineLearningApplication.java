package com.me.bitcoin.bitcoinAPI.App;

import com.me.bitcoin.bitcoinAPI.controller.WekaController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@SpringBootApplication
@ComponentScan(basePackageClasses = WekaController.class)
public class MachineLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(MachineLearningApplication.class, args);
		
		System.out.print("been a long time coming but we here now");
	}
}
