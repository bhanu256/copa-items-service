package com.copa.itemsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copa.itemsservice.feignclients.AuthServiceClient;

@RestController
@RequestMapping(value="item")
public class ItemsController {
	
	@Autowired
	AuthServiceClient authServiceClient;

	@GetMapping("{id}")
	public String getItem(@PathVariable String id) {
		
		if (authServiceClient.isUserValid())
			return id;
		else
			return " ";
	}
}
