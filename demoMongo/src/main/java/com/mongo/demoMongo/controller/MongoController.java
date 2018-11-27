package com.mongo.demoMongo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongoController {
	
	
	@RequestMapping("/get")
	public String Mongo () {
		return "Welocome Mongo";
	}

	@RequestMapping("/get/all")
	public String MongoAll () {
		return "Welocome Mongo all";
	}
}
