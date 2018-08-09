package com.exception;

public class ManagerException extends Exception {

	public ManagerException() {
		
	}

	public ManagerException(String message) {
		super(message);
		
	}

	public ManagerException(Throwable cause) {
		super(cause);
		
	}

	public ManagerException(String message, Throwable cause) {
		super(message, cause);
		
	}

}
