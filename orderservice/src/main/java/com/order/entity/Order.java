package com.order.entity;

public class Order {

	private Long orderId;
	private String ordername;
	private String orderdesc;
	public Order(Long orderId, String ordername, String orderdesc) {
		super();
		this.orderId = orderId;
		this.ordername = ordername;
		this.orderdesc = orderdesc;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrderdesc() {
		return orderdesc;
	}
	public void setOrderdesc(String orderdesc) {
		this.orderdesc = orderdesc;
	}
	
	
}
