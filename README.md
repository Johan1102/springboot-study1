# springboot-web1
- Spring Boot, JPA, AWS, Junit 테스트, Gradle, Mustache
- 스프링 부트와 AWS로 혼자 구현하는 웹 서비스 책 내용 구현

## 프로젝트 환경 
- IntelliJ 2019.2
- Java 8
- Gradle 4.10.2
- Spring Boot 2.1.7

### Gradle 버전 체크
- Gradle의 버전을 확인하고 5버전 이상이면 4로 다운그레이드 필요


![tempsnip](https://user-images.githubusercontent.com/93722435/177921216-a361fb1a-923f-436d-b752-97683eff5862.png)


- 아래 방법중 하나를 선택하여 Gradle 버전 변경

1. **gradle-wrapper.properties** 직접 프로퍼티 설정 
```
distributionUrl=https\://services.gradle.org/distributions/gradle-4.10.2-bin.zip
```

2. 인텔리제이에서 ```alt+F12``` 눌러 터미널을 열고 아래 명령 실행
```bash
gradlew wrapper --gradle-version 4.10.2
```
