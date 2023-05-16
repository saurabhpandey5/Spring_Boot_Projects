package com.Flights.entity;

public class Flight {
	private Long flightNo;
	private String flightName;
	private String flightModel;
	private Long userid;
	public Flight(Long flightNo, String flightName, String flightModel, Long userid) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.flightModel = flightModel;
		this.userid = userid;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(Long flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}

}
