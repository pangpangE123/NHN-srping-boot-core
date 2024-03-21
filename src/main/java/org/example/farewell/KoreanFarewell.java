package org.example.farewell;


//TODO-2 KoreanFarewell 을 Bean 으로 등록한다.
public class KoreanFarewell implements Farewell {

    @Override
    public void sayGoodBye() {
        System.out.println("good bye");
    }
}
