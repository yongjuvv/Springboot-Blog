package com.cos.blog.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDto;

import lombok.val;

@ControllerAdvice //모든 페이지에서 exception이 발생하면 이쪽으로
@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(value = IllegalArgumentException.class)
	public ResponseDto<String> handleArgumentException(IllegalArgumentException e) {
		return new ResponseDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
	}
	//모든 exception
//	@ExceptionHandler(value =Exception.class)
//	public String handleArgumentException(Exception e) {
//		return "<h1>" +e.getMessage() +"</h1>";
//	}
}
