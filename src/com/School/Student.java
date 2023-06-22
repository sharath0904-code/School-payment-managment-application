package com.School;

//Keeping the track of students fees, name, grade and fees paid.

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;


// To create a new student by  initializing.

	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 110000;
	}

	// updateds of a students
	public void setGrade(int grade) {
		this.grade = grade;
	}

	// Update the fee of student.
	public void paysFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	// returns the id of a student
	public int getId() {
		return id;
	}

	// return the name of the student
	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	@Override
	public String toString() {
		return "Student's Name  : " + name + " " + "Total Fees paid till now Rs." + feesPaid;
	}

}