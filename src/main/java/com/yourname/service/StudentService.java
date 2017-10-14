package com.yourname.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yourname.dao.StudentDao;
import com.yourname.entity.Student;

@Service
public class StudentService {

	@Autowired
	@Qualifier("fakeData")
	private StudentDao studentDao;

	public Collection<Student> getAllStudents() {
		return this.studentDao.getAllStudents();
	};

	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public void deleteStudentById(int id) {
		this.studentDao.deleteStudentById(id);
	};

	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
	}

	public void addStudent(Student student) {
		this.studentDao.addStudent(student);
	}

}
