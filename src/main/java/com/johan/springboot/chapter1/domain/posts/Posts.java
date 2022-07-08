package com.johan.springboot.chapter1.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
//@Entity : 실제 DB의 테이블과 매칭될 클래스임을 나타냄, 절때 Setter 메소드를 만들지 않음, 별도의 명확한 메소드로 접근
//기본값으로 클래스의 카멜케이스이름을 언더스코어 네이밍으로 테이블 매칭(PostsHello.java -> posts_hello table)
//Hibernate: create table posts (
// id bigint not null auto_increment,
// author varchar(255)
// , content TEXT not null
// , title varchar(500) not null
// , primary key (id))
@Entity
public class Posts {

    //@Id : 해당 테이블의 PK필드
    @Id
    //@GeneratedValue : PK 생성 규칙을 나타냄, 스프링부트2.0과 1.5버전 사용법 다름
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column : 테이블 컬럼을 나타냄, 선언하지 않아도 해당 클래스의 필드는 모두 컬럼으로 설정됨
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    //@Builder : 해당 클래스의 빌더 패턴 클래스 생성
    //생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    @Builder
    public Posts(String title , String content, String author) {
        System.out.println("@@@@@@@@@@@@@@@ in Entity Class(matched DB) @@@@@@@@@@@@@@@");
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
