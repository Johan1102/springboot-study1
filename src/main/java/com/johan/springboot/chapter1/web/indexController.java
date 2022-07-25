package com.johan.springboot.chapter1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//머스테치 스타터 덕분에 컨트롤러에서 문자열 반환 시 앞의 경로(\src\main\resources\templates)와
//뒤의 파일 확장자(.mustache)가 자동으로 지정 (src\main\resources\templates\index.mustache)
@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
