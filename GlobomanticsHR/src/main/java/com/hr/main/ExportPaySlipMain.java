package com.hr.main;

import java.time.Month;
import java.util.List;

import com.hr.documents.Payslip;
import com.hr.logging.ConsoleLogger;
import com.hr.persistence.EmployeeFileSerializer;
import com.hr.persistence.EmployeeRepository;
import com.hr.personnel.Employee;

/**
 * The Class ExportPaySlipMain.
 */
public class ExportPaySlipMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ConsoleLogger consoleLogger = new ConsoleLogger();
		EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
		EmployeeRepository employeeRepository = new EmployeeRepository(employeeFileSerializer);

		List<Employee> employees = employeeRepository.findAll();

		for (Employee employee : employees) {
			Payslip payslip = new Payslip(employee, Month.AUGUST);
			String exportableText = payslip.toText().toUpperCase();
			System.out.println(exportableText);
		}
	}

}
