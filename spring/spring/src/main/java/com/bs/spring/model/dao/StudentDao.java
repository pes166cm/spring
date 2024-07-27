package com.bs.spring.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bs.spring.model.vo.Student;

public interface StudentDao {
	List<Student> selectStudentAll(SqlSession session);
	Student selectStudentById(SqlSession session, String id);
	int insertStudent(SqlSession session, Student s);
	int updateStudent(SqlSession session, Student s);
	int deleteStudent(SqlSession sesssion, Student id);
}
