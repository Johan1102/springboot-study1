package com.johan.springboot.chapter1.web.domain.posts;

import com.johan.springboot.chapter1.domain.posts.Posts;
import com.johan.springboot.chapter1.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@SpringBootTest : 별도 설정 없을 경우 H2 DB 자동 실행
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    //@After : Junit 단위 테스트 끌날 때마다 수행될 메소드 메소드 지정
    //delete from posts where id=?
    @After
    public void cleanUp() {
        postsRepository.deleteAll();
    }

    @Test
    public void savedPostLoad() {
        String title = "테스트 제목";
        String content = "테스트 본문";

        //postsRepository.save : 테이블 posts에 insert/update 쿼리 실행
        //id 값이 있으면 update 없으면 insert 쿼리 실행
        //insert into posts (author, content, title) values (?, ?, ?)
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("yoohan1102@gmail.com")
                .build());

        //postsRepository.findAll(); : 테이블 posts에 있는 모든 데이터를 조회하는 메소드
        //select posts0_.id as id1_0_, posts0_.author as author2_0_, posts0_.content as content3_0_, posts0_.title as title4_0_
        //from posts posts0_
        List<Posts> postsList = postsRepository.findAll();

        Posts posts =  postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
