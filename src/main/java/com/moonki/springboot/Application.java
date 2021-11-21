package com.moonki.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// 앞으로 만들 프로젝트의 main 클래스가 되는것
@SpringBootApplication // 이것으로 인해 스프링 부트의 자동 설정, 스프링 bean 읽기와 생성을 모두 자동으로 설정
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내장 was 서버 실행
    }
}