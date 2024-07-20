package com.bs.spring.student.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private String name;
	private String age;
	private String hak;
	private String ban;
	private String hakka;
}
