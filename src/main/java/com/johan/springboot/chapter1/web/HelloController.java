package com.johan.springboot.chapter1.web;

import com.johan.springboot.chapter1.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    //@RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
    //외부에서 name (@RequestParam("name")) 이란 이름으로 넘긴 파라미터를 메소드 파라미터(String name)에 저장
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name")String name, @RequestParam("amount")int amount) {
        System.out.println("---------------- new HelloResponseDto("+name+", "+amount+")");
        return new HelloResponseDto(name, amount);
    }

}
