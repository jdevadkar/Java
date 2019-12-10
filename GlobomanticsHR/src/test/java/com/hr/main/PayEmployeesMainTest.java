package com.hr.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hr.payment.PaymentProcessor;

class PayEmployeesMainTest {

	@Test
	public void send_payments_should_pay_all_employee_salaries() {
		PaymentProcessor paymentProcessor = new PaymentProcessor();

		int result = paymentProcessor.sendPayments();
		assertEquals(5440, result);
	}

}
