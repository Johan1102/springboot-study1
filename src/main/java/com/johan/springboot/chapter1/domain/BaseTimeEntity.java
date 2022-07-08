package com.johan.springboot.chapter1.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
//@MappedSuperclass : JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 아래 필드(ex : createdData)들도 컬럼으로 인식
@MappedSuperclass
//@EntityListeners : 해당 클래스에 Auditing 기능 포함 시킴
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    //@CreatedDate : Entity가 생성되어 저장될 때 시간을 자동 저장
    @CreatedDate
    private LocalDateTime createdDate;

    //@LastModifiedDate : 조회한 Entity의 값을 변경할 때 시간을 자동 저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
