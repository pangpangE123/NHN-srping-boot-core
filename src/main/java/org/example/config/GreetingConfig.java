package org.example.config;

import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.example.greeting.KoreanGreeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

//    @Bean
//    EnglishGreeting englishGreeting() {
//        return new EnglishGreeting();
//    }

    //TODO-1 KoreanGreeting 을 Bean 으로 등록한다.
    @Bean
    Greeting koreanGreeting(){
        return new KoreanGreeting();
    }
}
