package com.app.appforceup.enumeration;

public enum EventChange {
	
	location("location.change"), 
	activity("activity.change"),
	health("health.change"),
	status("status.change");
	
    private String eventChange; 
	  

    public String getEventChange() 
    { 
        return this.eventChange; 
    } 

    private EventChange(String eventChange) 
    { 
        this.eventChange = eventChange; 
    } 

}
