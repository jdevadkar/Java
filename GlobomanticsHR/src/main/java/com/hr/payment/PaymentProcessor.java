package com.hr.payment;

import java.util.List;

import com.hr.notifications.EmailSender;
import com.hr.persistence.EmployeeFileSerializer;
import com.hr.persistence.EmployeeRepository;
import com.hr.personnel.Employee;

public class PaymentProcessor {

	private EmployeeRepository employeeRepository;

	public PaymentProcessor() {
		EmployeeFileSerializer serializer = new EmployeeFileSerializer();
		this.employeeRepository = new EmployeeRepository(serializer);
	}

	public int sendPayments() {
		List<Employee> employees = this.employeeRepository.findAll();
		int totalPayments = 0;
		for (Employee employee : employees) {
			totalPayments += employee.getMonthlyIncome();
			EmailSender.notify(employee);
		}
		return totalPayments;
	}
}
