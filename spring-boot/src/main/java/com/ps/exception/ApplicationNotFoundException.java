package com.ps.exception;

/**
 * The Class ApplicationNotFoundException.
 */
public class ApplicationNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6575214356644403899L;

	/**
	 * Instantiates a new application not found exception.
	 *
	 * @param exception the exception
	 */
	public ApplicationNotFoundException(String exception) {
		super(exception);
	}

}
