package com.cursor.main.java.hw8.controller;

import com.cursor.main.java.hw8.task1.BodyMassIndex;
import com.cursor.main.java.hw8.task3.FilmFilter;
import com.cursor.main.java.hw8.task4.Box;
import com.cursor.main.java.hw8.task4.Thing;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static com.cursor.main.java.hw8.task2.UsersFilter.usersFilter;

public class Executor {

    public static void runProgram(){
        System.out.println("Task 1");
        new BodyMassIndex().getBodyMassIndex();
        System.out.println("\nTask 2");
        usersFilter();
        System.out.println("\nTask 3");
        new FilmFilter().demonstrationFilterFilms();
        System.out.println("\nTask 4");

        List<Box> boxes= Arrays.asList(new Box(Arrays.asList(new Thing("pen",false),new Thing("vase",true))),
                new Box(Arrays.asList(new Thing("Key", false),new Thing("glasses", true))));
        System.out.println("all things: ");
        boxes.stream().flatMap(box -> box.getThings().stream()).forEach(thing -> System.out.println(thing.toString()));

    }
}