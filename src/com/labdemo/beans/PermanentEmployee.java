package com.labdemo.beans;

public class PermanentEmployee extends Employee {
	
	static private int totalPermEmployees = 0;
	private int yearsOfExperience = 0;

	{
		totalPermEmployees++;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public PermanentEmployee(EmployeeKey key, String fname, String lname, long salary, String grade, int day, int month,
			int year) {
		super(key, fname, lname, salary, grade, day, month, year);
	}

	public PermanentEmployee(EmployeeKey key, String fname, String lname, long salary, String grade, int month, int year) {
		super(key, fname, lname, salary, grade, month, year);
	}

	public static int getTotalPermEmployees() {
		return totalPermEmployees;
	}
	
}
