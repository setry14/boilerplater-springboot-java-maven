package com.yourname.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yourname.entity.Student;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {

	@Override
	public Collection<Student> getAllStudents() {
		return new ArrayList<Student>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(new Student(1, "ROBOT", "Cooking"));
			}
		};
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

	}

}
