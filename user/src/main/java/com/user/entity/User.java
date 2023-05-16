package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long userid;
	private String username;
	private String userphoneNo;
	List<Flight> flight= new ArrayList<>();
	
	public User(Long userid, String username, String userphoneNo, List<Flight> flight) {
		super();
		this.userid = userid;
		this.username = username;
		this.userphoneNo = userphoneNo;
		this.flight = flight;
	}
	public User(Long userid, String username, String userphoneNo) {
		super();
		this.userid = userid;
		this.username = username;
		this.userphoneNo = userphoneNo;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphoneNo() {
		return userphoneNo;
	}
	public void setUserphoneNo(String userphoneNo) {
		this.userphoneNo = userphoneNo;
	}
	public List<Flight> getFlight() {
		return flight;
	}
	public void setFlight(List<Flight> flight) {
		this.flight = flight;
	}
	
	
	
}
