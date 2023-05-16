package com.order.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.order.entity.Order;
import com.order.service.OrderService;


@RestController
@RequestMapping("/order")
public class Ordercontroller {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("{orderId}")
	public Order getorder(@PathVariable("orderId") Long orderId) {
		
        Order order=this.orderService.getorder(orderId);
		
		//http://localhost:9002/contact/user/1313
		String orders=this.restTemplate.getForObject("http://localhost:4402/product/order/"+order.getOrderId(), null);
		
		order.setOrderdesc(orders);
		return order;
	}
	
}
