package br.com.cobawski.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String messasge;
	private String details;

	public ExceptionResponse(Date timestamp, String messasge, String details) {
		this.timestamp = timestamp;
		this.messasge = messasge;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessasge() {
		return messasge;
	}

	public String getDetails() {
		return details;
	}	
}
