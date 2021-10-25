package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	//http://localhost:8000/blog/temp/home
	
	//파일리턴 기본경로 : src/main/resources/static
	// 리턴명 : /home.html
	@GetMapping("temp/home")
	 public String tempHome() {
		System.out.println("tempHome()"); 
		return "/home.html";
	 }
	@GetMapping("temp/jsp")
	public String tempJsp() {
		return "test";
		//prefix : /WEB-INF/views/
		//suffix : .jsp
		//풀네임 : /WEB-INF/views/test.jsp
		//jsp는 동적파일이 아니기때문에 static에서 찾을 수 없음
	}
}
