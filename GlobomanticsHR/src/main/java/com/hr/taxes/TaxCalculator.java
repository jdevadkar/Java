package com.hr.taxes;

import com.hr.personnel.Employee;

/**
 * The Interface TaxCalculator.
 */
public interface TaxCalculator {

	/**
	 * Calculate.
	 *
	 * @param employee the employee
	 * @return the double
	 */
	double calculate(Employee employee);
}
