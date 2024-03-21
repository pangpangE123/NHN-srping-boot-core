package org.example.farewell;

import org.springframework.stereotype.Component;


//TODO-2 @Component 방법으로 빈 등록
@Component
public class EnglishFarewell implements Farewell {

    @Override
    public void sayGoodBye() {
        System.out.println("good bye");
    }
}
