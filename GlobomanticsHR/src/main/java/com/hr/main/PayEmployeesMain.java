package com.hr.main;

import com.hr.payment.PaymentProcessor;

public class PayEmployeesMain {
	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		int totalpayments = paymentProcessor.sendPayments();
		System.out.println("Total payments " + totalpayments);
	}
}
