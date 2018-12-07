package com.app.appforceup.enumeration;

public enum Activity {
	stop("Stop"),
	walk("Walk"), 
	run("Run"), 
	cycle("Cycle"),
	drive("Drive"),
	no_data("No Data");
	
    private String action; 
	  

    public String getAction() 
    { 
        return this.action; 
    } 

    private Activity(String action) 
    { 
        this.action = action; 
    } 
}
