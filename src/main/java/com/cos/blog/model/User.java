package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ORM -> JAVA(다른언어 가능) Object -> 테이블로 매핑해주는 기술

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //User클래스가 MySql에 테이블이 생성이 된다.
 // @DynamicInsert //null인값 제외하고 insert
public class User {
	
	@Id //primary key가 된다는 것을 알려줌
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전량을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length = 30, unique = true)
	private String username; // id
	
	@Column(nullable = false, length = 70) // 비밀번호 해쉬로 암호화 할 것이기 때문에 자리 넉넉하게
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
//	@ColumnDefault("'user'") //문자라는 것을 알려주기 위해 '' 사용
// DB는 ROleType이라는게 없다
	@Enumerated(EnumType.STRING)
	private RoleType role; //Enum을 쓰는게 좋다(도메인 설정을 할 수 있음). //회원가입하면 회원의 역할(admin, user, manager)
	
	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
	
}
