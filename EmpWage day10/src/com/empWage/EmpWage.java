package com.empWage;

public class EmpWage {

	static final int isFullTime = 1;
	static final int isPartTime = 2;
	static final int isAbsent = 3;

	int noOfCompany = 0;
	public CompanyEmpWage[] companyEmpWage;

	EmpWage() {
		companyEmpWage = new CompanyEmpWage[5];
	}

	public void addCompany(String company, int empRatePerHr, int maxWorkingDays, int maxWorkingHrs) {
		companyEmpWage[noOfCompany] = new CompanyEmpWage(company, empRatePerHr, maxWorkingDays, maxWorkingHrs);
		noOfCompany++;
	}

	public void computeEmpWage() {
		for (int i = 0; i < noOfCompany; i++) {
			companyEmpWage[i].setTotalEmpWage(this.computeWage(companyEmpWage[i]));
			System.out.println(companyEmpWage[i]);
		}
	}

	public int computeWage(CompanyEmpWage companyEmp) {
		int empHrs = 0;
		int empWage = 0;
		int days = 0;
		int totalEmpHrs = 0;

		while (days < companyEmp.maxWorkingDays && totalEmpHrs <= companyEmp.maxWorkingHrs) {
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
		empWage = totalEmpHrs * companyEmp.empRatePerHr;
		return empWage;
	}
}
