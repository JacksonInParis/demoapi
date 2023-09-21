package com.sample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@PostMapping("/acceptOrder")
	public String acceptOrder (@RequestBody String requestBody) {
		
		System.out.println("Accepting order");
		System.out.println("*** requestBody : " + requestBody);
		System.out.println(" ");
				
		return "success";
		
	}
	
	
	@GetMapping("/getOrders")
	public String test () {
		
//		String content = "[{ \"orderWord\" : \"Kopi O Big\"},"
//				+ "{ \"orderWord\" : \"Milo Peng\"},"
//				+ "{ \"orderWord\" : \"Kokokam\"}]";
		
		String content = "Kopi O Big, Milo, Kokokam, Kopi Peng, Milo Big, Teh, Teh O, Kopi";
		
		System.out.println("Sending Order to client");
		System.out.println("*** content : " + content);
		System.out.println(" ");
		
		return content;
	}
	
	@GetMapping("/image/{id}")
	public String test (@PathVariable ("id") String id) {
		
		System.out.println("id: " + id);
		
		return id;
	}

}
