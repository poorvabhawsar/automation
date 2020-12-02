package com.slokam.examples;

public class FinalExample {

	public static final int MARKS =100;
	public static final String SUNDAY= "sunday";
	public static final String MONDAY= "abc";
	public static final String TUESDAY= "tuesday";
	public static final String WEDNESDAY= "wednesday";
	public static final String THURSDAY= "thursday";
	public static final String FRIDAY= "friday";
	public static final String SATURDAY= "saturday";
	
	public void dayActivity(String day) {
		if(day.equals(SUNDAY)) {
			System.out.println("Sunday is holiday");
		}else if(day.equals(MONDAY)) {
			System.out.println("Monday is holiday");
		}else if(day.equals(TUESDAY)) {
			System.out.println("Tuesday is holiday");
		}else if(day.equals(WEDNESDAY)) {
			System.out.println("Wednesday is holiday");
		}else if(day.equals(THURSDAY)) {
			System.out.println("thursday is holiday");
		}else if(day.equals(FRIDAY)) {
			System.out.println("friday is holiday");
		}else if(day.equals(SATURDAY)) {
			System.out.println("saturday is holiday");
		}
	}
	
	public void day2(String day) {
		switch (day) {
		case MONDAY:
			System.out.println("Monday is holiday");
			break;
		case TUESDAY:
			System.out.println("Monday is holiday");
			break;
		case WEDNESDAY:
			System.out.println("Monday is holiday");
			break;
		case THURSDAY:
			System.out.println("thursday is holiday");
			break;
		case FRIDAY:
			System.out.println("Monday is holiday");
			break;
		case SATURDAY:
			System.out.println("saturday is holiday");
			break;
		case SUNDAY:
			System.out.println("sunday is holiday");
			break;
			
		default:
			break;
		}
	}
	
	public void dayActivity1(WeekDay day) {
		switch (day) {
		case MONDAY:
			System.out.println("Monday is holiday");
			break;
		case TUESDAY:
			System.out.println("Monday is holiday");
			break;
		case WEDNESDAY:
			System.out.println("Monday is holiday");
			break;
		case THURSDAY:
			System.out.println("thursday is holiday");
			break;
		case FRIDAY:
			System.out.println("Monday is holiday");
			break;
		case SATURDAY:
			System.out.println("saturday is holiday");
			break;
		case SUNDAY:
			System.out.println("sunday is holiday");
			break;
			
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		FinalExample f = new FinalExample();
		f.dayActivity("sdfsd");
		f.dayActivity1(WeekDay.MONDAY);
		f.day2(FinalExample.THURSDAY);
	}
}
