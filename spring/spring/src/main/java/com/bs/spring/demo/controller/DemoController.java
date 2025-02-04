package com.bs.spring.demo.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.spring.demo.model.vo.Address;
import com.bs.spring.demo.model.vo.Demo;

@Controller //<-- 클래스 빈으로 등록
public class DemoController {
	@RequestMapping("/demo/demo.do")
	public String demo(){
		//자동으로 /WEB-INF/views/(리턴값).jsp  -> /WEB-INF/views/(demo/demo).jsp
		return "demo/demo";
	}
	
	//클라이언트가 보낸 데이터는 매핑메소드의 매개변수를 선언해서 처리함 
	// 1. HttpServletRequest : 요청정보를 저장하고 있는 객체
	// 2. HttpServletReseponse : 응답정보를 저장하고 있는 객체 -> 응답처리
	// 3. HttpSession : Session정보를 저장하는 객체(로그인처리할때)
	// 4. java.util.Locale : 서버의 로케일정보를 저장하는 객체 -> 지역에 대한 정보 ko_KR
	// 5. InputStream/Reader : 데이터를 서버로 읽어오는 객체 -> read()
	// 6. OutputStream/Writer : 데이터를 섯버에서 클라이트에 보내는 객체 -> write()
	// 7. 기본자료형 변수(int, String, double...) : 클라이언트가 보낸 데이터 name과 일치하게 선언하면 자동으로 저장시켜줌 
	// 8. VO클래스타입 : 클라이언트가 보낸 다수의 데이터를 자정하는 객체 -> 필드명하고 name값이 일치할때 자동으로 저장시켜줌
	// ** Date, 다른 클래스들...spring처리하지 못하는 것은 403 BadRequest에러를 발생!!
	// 9. java.util.Map : 클라이언트가 보낸 데이터를 key:value형식으로 데이터를 저장해시켜줌
	// ** 주의! 단일값으로 저장 -> 복수값은 해결이 안됨!! (체크박스라던가..뭐...그런건 안됨)
	// 매개변수앞에 사용하는 어노테이션
	// @RequestParam : 클라이언트가 보낸 데이터를 저장할때 추가 옵션설정할 수 있는 어노테이션
	// @RequestBody : 클라이언트가 보낸 데이터가 JSON방식일때 자바클래스로 변경해서 저장해주는 어노테이션
	// @SessionAttribute : HttpSession에 저장된 특정값을 가져올때 사용하는 어노테이션 
	// @ModelAttribute : Model객체에 데이터를 저장할때 사용하는 어노테이션  
	// @CookieValue : Cookie에 저장된 특정값을 가져올때 사용하는 어노테이션
	// @RequestHeader : RequestHeader에 특정 헤더값을 가져올때 사용하는 어노테이션
	
	@RequestMapping("/demo/demo1.do")
	public String dome1(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws SerialException, IOException{
		// System.out.println(request);
		// System.out.println(response);
		// System.out.println(session);
	
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("devName");
		int age = Integer.parseInt(request.getParameter("devAge"));
		String email = request.getParameter("devEmail");
		String gender = request.getParameter("devGender");
		//다중값을 가져올때는 getParameterValues()메소드를 이용
		//String[]을 반환
		String[] hobby = request.getParameterValues("devLang");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(Arrays.toString(hobby));
	
		Demo demo = Demo.builder().devName(name)
				.devAge(age)
				.devGender(gender)
				.devEmail(email)
				.devLang(hobby)
				.build();
		
		request.setAttribute("demo", demo);
		
		return "demo/demoResult";
	}
	
	//클라이언트 요청주소 /demo/demo2인 서비스 만들기
	@RequestMapping("/demo/demo2") 
	public String demo2(String devName, int devAge, 
			String devEmail, String devGender, String[] devLang, 
			Model model)throws SerialException, IOException{
		
		System.out.println(devName+" "+devAge+" "+devEmail+" "+devGender+" "+Arrays.toString(devLang));
		
		Demo d = Demo.builder()
				.devName(devName)
				.devAge(devAge)
				.devGender(devGender)
				.devEmail(devEmail)
				.devLang(devLang)
				.build();
		
		model.addAttribute("demo", d); // == request.setAttribute("demo",d);
		
		return "demo/demoResult";
	}
	
	//파라미터값에 대한 상세설정하기
	//@RequestParam어노테이션을 사용
	//파리미터값을 매핑, 기본값설정, 필수값여부를 설정
	@RequestMapping("/demo/demo3")
	public String demo3(
			@RequestParam(name = "name") String devName,
			@RequestParam(defaultValue = "10", required = false) int devAge,
			@RequestParam String devEmail,
			@RequestParam String devGender,
			@RequestParam String[] devLang
			) {
		
		//Demo demo = new Demo(devName, devAge, devEmail, devGender, devLang);
		
		System.out.println(devName+" "+devAge+" "+devEmail+" "+devGender+" " +Arrays.toString(devLang));
		
		return "demo/demo";
	}
	
	//객체자체로 파라미터값을 받아오기
	// 파라미터의 name값과 클래스의 필드값이 일치해야함
	@RequestMapping("/demo/demo4")
	public String demo4(Demo demo, Address address) {
		demo.setMyaddress(address);
		System.out.println(demo);
		return "demo/demo";
	}
	
	//파라미터 데이터 Map형식으로 받아서 처리하기
	@RequestMapping("/demo/demo5")
	public String demo5(@RequestParam Map param) {
		System.out.println(param); //Map은 단일 값으로만 가져온다. devLang같은 경우 맨 처음에 있는 값 1개를 가져온다.
		return "demo/demo";
	}
	
	//jsp에 출력할 데이터 전달하기

	
}
