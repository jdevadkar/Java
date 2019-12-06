package com.hr.main;

import java.util.List;

import com.hr.persistence.EmployeeFileSerializer;
import com.hr.persistence.EmployeeRepository;
import com.hr.personnel.Employee;
import com.hr.personnel.FullTimeEmployee;

/**
 * The Class NatHolidayEmployeeTimeOffMain.
 */
public class NatHolidayEmployeeTimeOffMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
		EmployeeRepository employeeRepository = new EmployeeRepository(employeeFileSerializer);

		List<Employee> employees = employeeRepository.findAll();
		Employee manager = new FullTimeEmployee("Steve Jackson", 5000);

		for (Employee employee : employees) {
			employee.requestTimeOff(1, manager);
		}
	}

}
