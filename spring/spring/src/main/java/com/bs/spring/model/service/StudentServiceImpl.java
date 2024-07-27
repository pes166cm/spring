package com.bs.spring.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.spring.model.dao.StudentDao;
import com.bs.spring.model.vo.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	@Autowired
	private SqlSession session;	
	
	@Override
	public List<Student> selectStudentAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectStudentById(String id) {
		return dao.selectStudentById(session, id);
	}

	@Override
	public int insertStudent(Student s) {
		return dao.insertStudent(session, s);
	}

	@Override
	public int updateStudent(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
