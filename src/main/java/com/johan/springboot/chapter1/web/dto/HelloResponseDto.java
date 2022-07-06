package com.johan.springboot.chapter1.web.dto;

//lombok : Getter, Setter, 기본생성자, toString 등 어노테이션으로 자동 생성
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//@Getter : 선언된 모든 필드의 get 메소드 생성
@Getter
//@RequiredArgsConstructor : 선언된 모든 final 필드가 포함된 생성자를 생성
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

//    public HelloResponseDto(String name, int amount) {
//        this.name = name;
//        this.amount = amount;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public int getAmount() {
//        return this.amount;
//    }

}
