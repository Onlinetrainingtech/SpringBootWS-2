package com.example.SpringBootExampleWebB14.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

	/*
	 * @RequestMapping("/") public ResponseEntity<String>sayHello() { return new
	 * ResponseEntity<String>("FirstWebApplication",HttpStatus.OK); }
	 */
	@RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World";
	   }
	
}
