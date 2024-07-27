package com.bs.spring.student.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bs.spring.student.model.vo.Student;

@Controller
public class ex_StudentController {
	@RequestMapping("/student/enrollstudent.do")
	public String student(String name, String age, 
			String hak, String ban, String hakka,
			Model model) throws SecurityException, IOException{
		
		Student stu = Student.builder()
				.name(name)
				.age(age)
				.hak(hak)
				.ban(ban)
				.hakka(hakka)
				.build();
		
		model.addAttribute("student", stu);
		
		return "student/student";
	}
	
	@RequestMapping("/student/enrollstudentend.do")
	public String studentend(String name, String age, 
			String hak, String ban, String hakka,
			Model model) throws SecurityException, IOException{
		
		Student student = Student.builder()
				.name(name)
				.age(age)
				.hak(hak)
				.ban(ban)
				.hakka(hakka)
				.build();
		
		model.addAttribute("student", student);
		
		return "student/studentend";
	}

}