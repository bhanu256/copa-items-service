package com.copa.itemsservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="item")
public class ItemsController {

	@GetMapping("{id}")
	public String getItem(@PathVariable String id) {
		return id;
	}
}
