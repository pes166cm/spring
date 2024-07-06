package com.bs.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //빈으로 등록한거임, 어노테이션으로 등록한거임
public class HelloController { //이거 POJO임
	
	public HelloController() {
		System.out.println("HelloController생성 ^u^ -b"); //이건 IoC임 스프링이 알아서 처리해줌
	}
	
	@RequestMapping("/") //http://localhost:9090/spring/
	public String mainpage() { //호출하는 구문은 DispatcherServlet가 해준다 (스프링이 알아서 해줌)
		System.out.println("mainpate메소드 실행!!");
		
		return "index";
	}
}
