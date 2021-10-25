package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

// DAO라고 생각하면 됨
// 자동으로 bean등록이 된다.
//@Repository생략 가능
//User테이블을 관리하는 Repository 생성
public interface UserRepository extends JpaRepository<User, Integer>{

	//JPA Naming전략
	//select * from user where username = ?(1) and password = ?(2) ;
	User findByUsernameAndPassword(String username, String password);
	
	//이방식으로도 사용 가능
//	@Query(value="select * from user where username = ? and password = ? ;", nativeQuery = true)
//	User login(String username, String password);
}
