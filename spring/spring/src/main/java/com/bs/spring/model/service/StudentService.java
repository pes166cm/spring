package com.bs.spring.model.service;

import java.util.List;

import com.bs.spring.model.vo.Student;

public interface StudentService {
	List<Student> selectStudentAll();
	Student selectStudentById(String id);
	int insertStudent(Student s);
	int updateStudent(Student s);
	int deleteStudent(String id);
}
