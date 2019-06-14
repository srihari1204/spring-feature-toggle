package com.cubic.exception;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
public class ErrorMessage {

    private Date timestamp;
    private String message;
    private String details;

    public static final String NOT_FOUND_MESSAGE = "Resource Not Found Error Occurred,please contact support.";
    public static final String INTERNAL_SERVER_ERROR_MESSAGE = "Unknown Error Occurred,please contact support.";
    public static final String METHOD_NOT_ALLOWED_MESSAGE = "Unknown Error Occurred,please contact support.";
    public static final String UNSUPPORTED_MEDIA_TYPE_MESSAGE = "Unknown Error Occurred,please contact support.";
    public static final String MEDIA_TYPE_NOT_ACCEPTABLE_MESSAGE = "Unknown Error Occurred,please contact support.";
    public static final String DATABASE_ERROR_MESSAGE = "Database Error,please contact support.";


    public ErrorMessage(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }


    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }



}