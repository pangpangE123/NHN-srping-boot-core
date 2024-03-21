package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.farewell.Farewell;
import org.example.greeting.Greeting;
import org.example.sender.Sender;
import org.example.sender.Request;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


// TODO-1 ApplicationRunner.run() 은 Spring application 이 실행되면서 사동으로 실행되는 메소드이다.
@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    // TODO-4 applicationContext 를 통해, 등록된 bean 을 사용한다.
    private final ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) {

        Greeting greeting = applicationContext.getBean(Greeting.class);

        greeting.sayHello();

        Sender sender = applicationContext.getBean(Sender.class);

        Request request = new Request("sando", "hello");
        sender.sendMessage(request);

        Farewell farewell = applicationContext.getBean(Farewell.class);

        farewell.sayGoodBye();

    }
}