package com.factory.demo;

import java.util.Calendar;

public class Reminder {
	
	private String eventName;
	private Calendar eventDate;
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Calendar getEventDate() {
		return eventDate;
	}
	public void setEventDate(Calendar eventDate) {
		this.eventDate = eventDate;
	}
	@Override
	public String toString() {
		return "Reminder [eventName=" + eventName + ", eventDate=" + eventDate + "]";
	}
 
  
}
