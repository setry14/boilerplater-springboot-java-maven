package com.yourname.dao;

import java.util.Collection;

import com.yourname.entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void deleteStudentById(int id);

	void updateStudent(Student student);

	void addStudent(Student student);

}