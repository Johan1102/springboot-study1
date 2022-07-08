package com.johan.springboot.chapter1.service.posts;

import com.johan.springboot.chapter1.domain.posts.Posts;
import com.johan.springboot.chapter1.domain.posts.PostsRepository;
import com.johan.springboot.chapter1.web.dto.PostsResponseDto;
import com.johan.springboot.chapter1.web.dto.PostsSaveRequestDto;
import com.johan.springboot.chapter1.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    //@RequiredArgsConstructor로 생성자를 생성하여 스프링 bean(스프링 자바 객체)를 주입 받음
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        System.out.println("@@@@@@@@@@@@@@@ in service @@@@@@@@@@@@@@@");
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = "+id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = "+id));

        return new PostsResponseDto(entity);
    }
}
