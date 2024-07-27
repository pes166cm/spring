package com.bs.spring.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
	private String studentId;
	private String studentPwd;
	private String studentName;
	private String schoolName;
	private int studentGrade;
	private String studentNickname;
	private Date enroll_date;
}
