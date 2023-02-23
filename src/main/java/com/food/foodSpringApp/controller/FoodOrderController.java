package com.food.foodSpringApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.foodSpringApp.dao.FoodOrderDao;
import com.food.foodSpringApp.dto.FoodOrder;

@RestController
@RequestMapping("/foodOrders")
public class FoodOrderController {
	
	@Autowired
	FoodOrderDao foodOrderDao;

	@PostMapping
	public FoodOrder placeFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderDao.saveFoodOrder(foodOrder);

}

}