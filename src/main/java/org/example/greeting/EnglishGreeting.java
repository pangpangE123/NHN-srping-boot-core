package org.example.greeting;

public class EnglishGreeting implements Greeting {


    // TODO-1 객체 생성 확인을 위해 생성자에 로그를 남긴다.
    public EnglishGreeting() {
        System.out.println("english java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

}
