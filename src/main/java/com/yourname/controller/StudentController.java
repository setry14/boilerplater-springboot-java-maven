package com.yourname.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yourname.entity.Student;
import com.yourname.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents() {
		return studentService.getAllStudents();
	};

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	};

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteStudentById(@PathVariable("id") int id) {
		studentService.deleteStudentById(id);
	};

	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	};

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	};
}
