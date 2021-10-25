package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

// DAO라고 생각하면 됨
// 자동으로 bean등록이 된다.
//@Repository생략 가능
//User테이블을 관리하는 Repository 생성
public interface UserRepository extends JpaRepository<User, Integer>{

}
