# springboot-study1
Spring Boot, Spring Data Jpa, AWS 웹 서버 구현

## 프로젝트 환경 
- Intelij 2019.2
- Java 8
- Gradle 4.10.2
- Spring Boot 2.1.7

### Gradle 버전 체크
Gradle의 버전을 확인하고 5버전 이상이면 변경 필요


![tempsnip](https://user-images.githubusercontent.com/93722435/177921216-a361fb1a-923f-436d-b752-97683eff5862.png)

**gradle-wrapper.properties**
```
distributionUrl=https\://services.gradle.org/distributions/gradle-4.10.2-bin.zip
```
직접 설정 변경


인텔리제이에서 ```alt+F12``` 눌러 터미널을 열고 아래 명령 실행
```bash
gradlew wrapper --gradle-version 4.10.2
```
