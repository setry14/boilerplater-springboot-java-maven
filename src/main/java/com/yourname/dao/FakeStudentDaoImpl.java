package com.yourname.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yourname.entity.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {
	private static Map<Integer, Student> students;

	static {

		students = new HashMap<Integer, Student>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(1, new Student(1, "Sumeet1", "SpringBoot"));
				put(2, new Student(2, "Sumeet2", "Maven"));
				put(3, new Student(3, "Sumeet3", "Java"));
			}
		};

	}

	/* (non-Javadoc)
	 * @see com.yourname.dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents() {
		return FakeStudentDaoImpl.students.values();
	};

	/* (non-Javadoc)
	 * @see com.yourname.dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return FakeStudentDaoImpl.students.get(id);
	}

	/* (non-Javadoc)
	 * @see com.yourname.dao.StudentDao#deleteStudentById(int)
	 */
	@Override
	public void deleteStudentById(int id) {
		FakeStudentDaoImpl.students.remove(id);
	};

	/* (non-Javadoc)
	 * @see com.yourname.dao.StudentDao#updateStudent(com.yourname.entity.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		Student studentUpdate = students.get(student.getId());
		studentUpdate.setCourse(student.getCourse());
		studentUpdate.setName(student.getName());
		students.put(student.getId(), student);
	}

	/* (non-Javadoc)
	 * @see com.yourname.dao.StudentDao#addStudent(com.yourname.entity.Student)
	 */
	@Override
	public void addStudent(Student student) {
		FakeStudentDaoImpl.students.put(student.getId(), student);
	}

}
