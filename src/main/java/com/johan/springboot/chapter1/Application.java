package com.johan.springboot.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing : JPA Auditing 어노테이션 모두 활성화
@EnableJpaAuditing
//@SpringBootApplication : 스프링 부트의 자동 설정, 스프링Bean 읽기-생성 자동 설정
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        //SpringApplication.run : 내장 WAS 실행 톰캣 설치 불필요
        SpringApplication.run(Application.class, args);
    }

}
