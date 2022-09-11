package com.empWage;

public class CompanyEmpWage {

	String company;
	int empRatePerHr;
	int maxWorkingDays;
	int maxWorkingHrs;
	int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHr, int maxWorkingDays, int maxWorkingHrs) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "CompanyEmpWage [company=" + company + ", totalEmpWage=" + totalEmpWage + "]";
	}
}
