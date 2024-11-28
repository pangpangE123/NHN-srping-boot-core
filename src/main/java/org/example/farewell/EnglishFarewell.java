package org.example.farewell;

import org.springframework.stereotype.Component;


//@Component
public class EnglishFarewell implements Farewell {
    @Override
    public void sayGoodBye() {
        System.out.println("good bye");
    }
}
