package com.bs.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bs.spring.model.service.StudentService;
import com.bs.spring.model.vo.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("/testStudent")
	public String studentTest() {
		//DB의 Student테이블에 있는 데이터를 조회해서 응답하는 기능
		Student s = service.selectStudentById("admin");
		
		System.out.println(s);
		
		return "";
	}
	
	@RequestMapping("/login.do")
	public String studentTable(String userId, String pw, HttpSession session) {
		//System.out.println(userId+" "+pw);
		Student s = service.selectStudentById(userId);
		//System.out.println(s);
		if(s!=null&&s.getStudentPwd().equals(pw)) {
			//로그인 성공
			System.out.println("성공");
			session.setAttribute("loginStudent", s);
		} else {
			//로그인 실패
			System.out.println("실패");
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate(); //session삭제
		
		return "redirect:/";
	}
	
	@RequestMapping("/enrollstudent.do")
	public String enrollStudentPage() {
		
		return "student/enrollStudent";
	}
	
	@RequestMapping("/enrollendeStudent.do")
	public String enrollEndStudent(Student student) {
		int result = service.insertStudent(student);
		
		
		return "redirect:/";
	}
	
}
