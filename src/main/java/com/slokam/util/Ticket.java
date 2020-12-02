package com.slokam.util;

public class Ticket {

	private int sno;
	private String ticketId;
	private String actualTime;
	private String actualCost;
	private String estimatedCost;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getActualTime() {
		return actualTime;
	}
	public void setActualTime(String actualTime) {
		this.actualTime = actualTime;
	}
	public String getActualCost() {
		return actualCost;
	}
	public void setActualCost(String actualCost) {
		this.actualCost = actualCost;
	}
	public String getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(String estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
}
