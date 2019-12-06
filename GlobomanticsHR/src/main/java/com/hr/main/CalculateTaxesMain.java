package com.hr.main;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import com.hr.logging.ConsoleLogger;
import com.hr.persistence.EmployeeFileSerializer;
import com.hr.persistence.EmployeeRepository;
import com.hr.personnel.Employee;
import com.hr.taxes.TaxCalculator;
import com.hr.taxes.TaxCalculatorFactory;

/**
 * The Class CalculateTaxesMain.
 */
public class CalculateTaxesMain {

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

		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

		double totaltaxes = 0;
		for (Employee employee : employees) {
			TaxCalculator taxCalculator = TaxCalculatorFactory.create(employee);

			double tax = taxCalculator.calculate(employee);
			String formattedTax = currencyFormatter.format(tax);
			consoleLogger.writeInfo(employee.getFullName() + " taxes: " + formattedTax);

			totaltaxes += taxCalculator.calculate(employee);
		}
		consoleLogger.writeInfo("Total taxes = " + currencyFormatter.format(totaltaxes));
	}
}
