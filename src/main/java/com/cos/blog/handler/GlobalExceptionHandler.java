package com.cos.blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;import lombok.val;

@ControllerAdvice //모든 페이지에서 exception이 발생하면 이쪽으로
@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(value = IllegalArgumentException.class)
	public String handleArgumentException(IllegalArgumentException e) {
		return "<h1>" +e.getMessage() +"</h1>";
	}
	//모든 exception
//	@ExceptionHandler(value =Exception.class)
//	public String handleArgumentException(Exception e) {
//		return "<h1>" +e.getMessage() +"</h1>";
//	}
}
