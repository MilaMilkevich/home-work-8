package com.cursor.main.java.hw8.task1;

public class BodyMassIndex {
    public void getBodyMassIndex(){
        Functional functional=((height, weight) -> weight/(height*height));
        System.out.println("Your body mass is: "+functional.BodyMassIndex(1.62, 51));
    }
}
