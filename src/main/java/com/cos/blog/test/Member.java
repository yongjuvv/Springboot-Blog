package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Member {
	private  int id;
	private  String username;
	private  String password;
	private  String email;
	//변경할 일이 없으면 final을 붙임, 변경할 일 있으면 final X
	
	@Builder
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}
