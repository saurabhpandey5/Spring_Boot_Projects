package com.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.order.entity.Order;

@Component
public class OrderServiceImpl implements OrderService {

	List<Order> list = List.of(new Order(1L, "berger", "berger point"),
							   new Order(2L, "pizza", "pizza cave"));

	@Override
	public Order getorder(Long orderId) {
		return list.stream().filter(order -> order.getOrderId().equals(orderId)).findAny().orElse(null);
	}

}
