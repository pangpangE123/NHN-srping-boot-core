package org.example.config;

import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GreetingConfig {

    //TODO-3 englishGreeting 의 Scope 를 singleton 으로 지정한다. (@Bean 을 이용한 spring bean)
    @Bean
    @Scope("singleton")
    Greeting englishGreeting() {
        return new EnglishGreeting();
    }

}
