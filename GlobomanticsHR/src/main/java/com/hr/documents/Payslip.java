package com.hr.documents;

import java.time.Month;

import com.hr.personnel.Employee;

/**
 * The Class Payslip.
 */
public class Payslip implements ExportableText {

	/** The employee name. */
	private String employeeName;

	/** The monthly income. */
	private int monthlyIncome;

	/** The month. */
	private Month month;

	/**
	 * Gets the employee name.
	 *
	 * @return the employee name
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Gets the monthly income.
	 *
	 * @return the monthly income
	 */
	public int getMonthlyIncome() {
		return monthlyIncome;
	}

	/**
	 * Gets the month.
	 *
	 * @return the month
	 */
	public Month getMonth() {
		return month;
	}

	/**
	 * Instantiates a new payslip.
	 *
	 * @param employee the employee
	 * @param month    the month
	 */
	public Payslip(Employee employee, Month month) {
		super();
		this.employeeName = employee.getFullName();
		this.monthlyIncome = employee.getMonthlyIncome();
		this.month = month;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hr.documents.ExportableText#toText()
	 */
	@Override
	public String toText() {
		StringBuilder sb = new StringBuilder();
		sb.append("MONTH: ").append(this.month);
		sb.append(System.lineSeparator());
		sb.append("NAME: ").append(this.employeeName);
		sb.append(System.lineSeparator());
		sb.append("INCOME: ").append(this.monthlyIncome);
		sb.append(System.lineSeparator());

		return sb.toString();
	}
}
