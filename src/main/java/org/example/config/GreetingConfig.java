package org.example.config;

import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//TODO-2 @Configuration + @Bean 방법으로 빈 등록
@Configuration
public class GreetingConfig {

    @Bean
    Greeting englishGreeting() {
        return new EnglishGreeting();
    }

}
