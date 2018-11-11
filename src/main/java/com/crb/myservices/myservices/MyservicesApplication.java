package com.crb.myservices.myservices;

//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class MyservicesApplication 
{
//	@RequestMapping("/")
 //   String home() {return "Hello World!";}
	
	public static void main(String[] args) {
		SpringApplication.run(MyservicesApplication.class, args);
	}
}
