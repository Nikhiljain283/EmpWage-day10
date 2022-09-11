package com.empWage;

public class Main {
	public static void main(String[] args) {
		EmpWage company= new EmpWage();
		company.addCompany("Dmart", 120, 20, 170);
		company.addCompany("Amazon", 110, 15, 180);
		company.computeEmpWage();
	}
}
