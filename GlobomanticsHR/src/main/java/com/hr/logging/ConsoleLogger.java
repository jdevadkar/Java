package com.hr.logging;

/**
 * The Class ConsoleLogger.
 */
public class ConsoleLogger {

	/**
	 * Write info.
	 *
	 * @param msg the msg
	 */
	public void writeInfo(String msg) {
		System.out.println("Info: " + msg);
	}

	/**
	 * Write error.
	 *
	 * @param msg the msg
	 * @param e   the e
	 */
	public void writeError(String msg, Exception e) {
		System.err.println("Error: " + msg + ";" + e);
	}
}
