package com.School;

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;

//	Creates a new teacher object.

	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}

//	Return the id of a teacher
	public int getId() {
		return id;
	}

//	Return the name of the teacher
	public String getName() {
		return name;
	}

//	Return the salary of the teacher
	public int getSalary() {
		return salary;
	}

//	update the teacher salary
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * * Adds to salryEarned. *Removes from the total money earned by the school.
	 */

	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneyspent(salary);
	}

	@Override
	public String toString() {
		return "Name of the Teacher  : " + name + " " + "Total Salary earned till now Rs." + salaryEarned;
	}

}
