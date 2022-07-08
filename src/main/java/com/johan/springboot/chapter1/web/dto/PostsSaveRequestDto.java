package com.johan.springboot.chapter1.web.dto;

import com.johan.springboot.chapter1.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Entity(Posts) 클래스와 유사한 형태이나 DTO클래스를 추가로 생성
//Entity클래스를 Request/Response로 사용X, DB와 매칭되는 핵심 클래스이기 때문
@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        System.out.println("@@@@@@@@@@@@@@@ requestDto @@@@@@@@@@@@@@@");
        return Posts.builder()
                .title(this.title)
                .content(this.content)
                .author(this.author)
                .build();
    }
}
