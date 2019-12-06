package com.hr.main;

import java.io.IOException;
import java.util.List;

import com.hr.logging.ConsoleLogger;
import com.hr.persistence.EmployeeFileSerializer;
import com.hr.persistence.EmployeeRepository;
import com.hr.personnel.Employee;

/**
 * The Class SaveEmployeeMain.
 */
public class SaveEmployeeMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
		ConsoleLogger consileLogger = new ConsoleLogger();

		EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);
		List<Employee> employees = repository.findAll();

		for (Employee e : employees) {
			try {
				repository.save(e);
				consileLogger.writeInfo("Saved employee " + e.toString());
			} catch (IOException exception) {
				consileLogger.writeError("Error saving employee", exception);
			}
		}
	}
}
