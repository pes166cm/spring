package com.bs.spring.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bs.spring.model.vo.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> selectStudentAll(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectStudentById(SqlSession session, String id) {
		//select문을 실행할때는 두개의 메소드를 이용할 수 있음
		//selectOne : select문의 실행결과가 0~1개의 row일때 사용하는 메소드
		//selectList : select문의 실행결과가 0~다수의 row일때 사용하는 메소드
		//매개변수 두개
		//첫번째는 mapper와 실행할 sql문을 설정 -> "mapper namespace.sql문id"
		//두번째는 sql문 실행시 필요한 데이터(parameter)설정
		return session.selectOne("student.selectStudentById", id); 
	}

	@Override
	public int insertStudent(SqlSession session, Student s) {
		return session.insert("student.insertStudent", s);
	}

	@Override
	public int updateStudent(SqlSession session, Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(SqlSession sesssion, Student id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
