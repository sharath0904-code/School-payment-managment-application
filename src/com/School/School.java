package com.School;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	public String getTotalMoneySpent;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

//	object School is created.

	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;

		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

//	Return the teachers in the school
	public List<Teacher> getTeachers() {
		return teachers;
	}

//  Updates the teachers in the School.
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

//	Return the students in the school.
	public List<Student> getStudent() {
		return students;
	}

//	ADD the students in the school.
	public void addStudent(Student student) {
		students.add(student);
	}

//	Total money earned by the school.
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

//	updates the total money earned.
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	// 0 =0+money earned.
//	Total money Spent by the school.
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

//	updates the total money Spent.
	public static void updateTotalMoneyspent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}

}
