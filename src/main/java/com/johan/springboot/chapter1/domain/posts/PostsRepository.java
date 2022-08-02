package com.johan.springboot.chapter1.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Mybatis에서 DAO 또는 JPA에서 Repository라고 불리며 인터페이스로 생성
//JpaRepository<Entity 클래스, PK 데이터타입>를 상속하면 기본적인 CRUD 메소드 자동 생성
//Entity 클래스와 기본 Repository는 함께 위치해야함으로 같은 도메인 패키지에서 함께 관리
public interface PostsRepository extends JpaRepository<Posts, Long> {

    //@Query : Spring Data Jpa에서 제공하지 않는 쿼리 메소드 생성
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
