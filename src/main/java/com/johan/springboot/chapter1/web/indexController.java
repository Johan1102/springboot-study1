package com.johan.springboot.chapter1.web;

import com.johan.springboot.chapter1.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@RequiredArgsConstructor
//머스테치 스타터 덕분에 컨트롤러에서 문자열 반환 시 앞의 경로(\src\main\resources\templates)와
//뒤의 파일 확장자(.mustache)가 자동으로 지정 (src\main\resources\templates\index.mustache)
@Controller
public class indexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model)
    {
        //Model : 서버 템플릿 엔진에서 사용할 수 있는 객체 저장 가능
        //postsService.findAllDesc()로 가져온 결과를 posts로 index.mustache에 전달
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
