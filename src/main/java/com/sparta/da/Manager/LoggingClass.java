package com.sparta.da.Manager;

import org.apache.log4j.Logger;

public class LoggingClass {
    private String message;
    private Logger log = Logger.getLogger(LoggingClass.class.getName());

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        log.trace("Message set");
    }

    public void displayMessage(){
        System.out.println(message);
        log.debug("Message Printed - " + message);
    }
}
