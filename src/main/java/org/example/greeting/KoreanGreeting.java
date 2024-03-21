package org.example.greeting;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//TODO-4 koreanGreeting 의 Scope 를 prototype 으로 지정한다. (@Component 를 이용한 spring bean)
@Component
@Scope("prototype")
public class KoreanGreeting implements Greeting {


    // TODO-2 객체 생성 확인을 위해 생성자에 로그를 남긴다.
    public KoreanGreeting() {
        System.out.println("korean java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }

}

