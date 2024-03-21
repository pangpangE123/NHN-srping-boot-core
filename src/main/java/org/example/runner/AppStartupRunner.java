package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {


    private final ApplicationContext applicationContext;

    //TODO-4 hash 코드와 생성자 호출을 보고, 어떻게 생성되는 지 생각해본다.
    @Override
    public void run(ApplicationArguments args) {

        System.out.println("=============");

        //TODO-5 bean 의 이름으로도 특정하여 가져올 수 있다.
        Greeting greeting = (Greeting) applicationContext.getBean("englishGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

        System.out.println("=============");

        greeting = (Greeting) applicationContext.getBean("englishGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

        System.out.println("=============");

        greeting = (Greeting) applicationContext.getBean("koreanGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

        System.out.println("=============");

        greeting = (Greeting) applicationContext.getBean("koreanGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

    }
}