package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일) ==> @Controller

//사용자가 요청 -> 응답(Data)

//인터넷 브라우저요청은 get 요청밖에 할 수 없다
//post, put, delete 요청 할 수 없음
@RestController
public class HttpControllerTest {
	
	private static final String Tag = "HttpControllerTest : ";
	
	@GetMapping("http/lombok")
	public String lombokTest() {
		// 빌더패턴을 사용하면 순서가 상관없음, 필드에 어떤 순서로 값이 들어가는지 상관없음
		Member m = Member.builder().password("1234").username("yongju").email("email.com").build();
		System.out.println(Tag + "getter : " + m.getUsername());
		m.setUsername("yong");
		System.out.println(m.getEmail());
		System.out.println(m.getUsername());
		System.out.println(Tag + "setter  : " + m.getUsername());
		return "lombok test 완료";
	}
	// http://localhost:8181/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청 " + m.getId() +","+ m.getPassword()+","+m.getEmail();
	}
	// http://localhost:8181/http/post (insert)
	@PostMapping("/http/post")
	public String postTest() {
		return "post 요청";
	}
	// http://localhost:8181/http/put (update)
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	// http://localhost:8181/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
