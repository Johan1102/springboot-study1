package com.johan.springboot.chapter1.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class) : 테스트 진행할 때 JUnit 내장 실행자 외 실행자 실행.
//SpringRunner 스프링 실행자 사용
//스프링부트 테스트와 JUnit 사이에 연결자 역할.
@RunWith(SpringRunner.class)
//@WebMvcTest : 스프링 테스트 어노테이션 중 Web(Spring MVC)에 집중하는 어노테이션
//선언 시 @Controller, @ControllerAdvice 사용 가능
//@Service, @Component, @Repository 사용 불가능
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    //@Autowired : 스프링이 관리하는 bean 주입 받음
    @Autowired
    //MockMvc : 웹 API 테스트 시 사용, 스프링 MVC 테스트 시작점
    //MockMvc 클래스를 통해 HTTP 메소드 API 테스트 가능
    private MockMvc mvc;

    @Test
    public void helloReturn() throws Exception {
        String hello = "hello";
        //mvc.perform(get("/hello")) : /hello주소로 http get 요청
        //andExpect(status().isOk()) : HTTP header의 status 검증, 200인지 아닌지 검증
        //andExpect(content().string(hello)) : 응답 본문 내용 검증, "hello"값 검증
        mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));
    }
}
