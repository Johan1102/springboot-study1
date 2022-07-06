package com.johan.springboot.chapter1.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);
        System.out.println("dto.getName() = "+dto.getName());
        System.out.println("dto.getAmount() = "+dto.getAmount());

        //assertThat : assertj 테스트 검증 메소드, 메소드 체이닝 지원되어 isEqualTo 같이 메소드 연결 사용 가능
        //isEqualTo : assertj의 동등 비교 메소드, assertThat의 값과 isEqualTo 값을 비교해서 같으면 성공
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
