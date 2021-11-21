package com.moonki.springboot.web;

import com.moonki.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller를 JSON을 반환하는 Controller로 만들어 줌
public class HelloController {

    @GetMapping("/hello") // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줌
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name, @RequestParam("amount") int amount){ // requestparam : 외부에서 api로 넘긴 파라미터를 가져오는 어노테이션
        return new HelloResponseDto(name,amount);
    }
}
