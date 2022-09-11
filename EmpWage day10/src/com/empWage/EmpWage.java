package com.empWage;

public class EmpWage {

	static final int isFullTime = 1;
	static final int isPartTime = 2;
	static final int isAbsent = 3;

	public String company;
	int empRatePerHr;
	int maxWorkingDays;
	int maxWorkingHrs;

	public EmpWage(String company, int empRatePerHr, int maxWorkingDays, int maxWorkingHrs) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}

	public void computeWage() {
		int empHrs = 0;
		int empWage = 0;
		int days = 0;
		int totalEmpHrs = 0;

		while (days < maxWorkingDays && totalEmpHrs <= maxWorkingHrs) {
			int empCheck = (int) (Math.random() * 3) + 1;
			days++;
			switch (empCheck) {
			case isFullTime:
				empHrs = 8;
				break;
			case isPartTime:
				empHrs = 4;
				break;
			case isAbsent:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
		}
		System.out.println("Company name : " + company);
		System.out.println("Emp rate per hour : "+empRatePerHr);
		System.out.println("Total employee hours : " + totalEmpHrs);
		empWage = totalEmpHrs * empRatePerHr;
		System.out.println("employee Monthly wage : " + empWage);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		System.out.println(" ");
		EmpWage dmart = new EmpWage("Dmart", 120, 20, 170);
		EmpWage google = new EmpWage("Google", 140, 21, 160);
		dmart.computeWage();
		google.computeWage();
	}
}
