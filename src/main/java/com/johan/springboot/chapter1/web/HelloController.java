package com.johan.springboot.chapter1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController : Controller를 JSON을 반환하는 Controller로 만들어줌.
//각 메소드마다 선언했던 @ResponseBody를 한 번에 선언 가능하게 함.
@RestController
public class HelloController {

    //@GetMapping : HTTP Method Get 요청을 받는 API 생성
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
