package com.gracefulshutdown;

import javax.annotation.PreDestroy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {


	@GetMapping("/")
	public String firstProgram() throws InterruptedException {
		
		return "This is my first program ";
	}

		
		
	/*
	 * @RequestMapping("/user") public String hello() throws InterruptedException {
	 * System.out.println("Before sleep"); Thread.sleep(10000);
	 * System.out.println("After  sleep"); return "hellow word"; }
	 * 
	 * 
	 * @PreDestroy public void destroy() {
	 * 
	 * 
	 * System.out.println("Insidde destroy "); }
	 */
}
