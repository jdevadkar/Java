package com.hr.taxes;

import com.hr.personnel.Employee;
import com.hr.personnel.FullTimeEmployee;
import com.hr.personnel.Intern;
import com.hr.personnel.PartTimeEmployee;

/**
 * A factory for creating TaxCalculator objects.
 */
public class TaxCalculatorFactory {

	/**
	 * Creates the.
	 *
	 * @param employee the employee
	 * @return the tax calculator
	 */
	public static TaxCalculator create(Employee employee) {
		if (employee instanceof FullTimeEmployee) {
			return new FullTimeTaxCalculator();
		}

		if (employee instanceof PartTimeEmployee) {
			return new PartTimeTaxCalculator();
		}
		if (employee instanceof Intern) {
			return new InternTaxCalculator();
		}
		throw new RuntimeException("Invalid employee type");
	}

}
