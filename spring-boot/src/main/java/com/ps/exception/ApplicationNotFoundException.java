package com.ps.exception;
/**
 * The Class ApplicationNotFoundException.
 */
public class ApplicationNotFoundException extends RuntimeException {
	
	/**
	 * Instantiates a new application not found exception.
	 *
	 * @param exception the exception
	 */
	public ApplicationNotFoundException(String exception) {
		super(exception);
	}

}
