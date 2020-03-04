package com.cursor.main.java.hw8.controller;

import com.cursor.main.java.hw8.task1.BodyMassIndex;
import com.cursor.main.java.hw8.task3.FilmFilter;
import com.cursor.main.java.hw8.task4.BoxList;

import static com.cursor.main.java.hw8.task2.UsersFilter.usersFilter;

public class Executor {

    public static void runProgram() {
        System.out.println("Task 1");
        new BodyMassIndex().getBodyMassIndex();
        System.out.println("\nTask 2");
        usersFilter();
        System.out.println("\nTask 3");
        new FilmFilter().demonstrationFilterFilms();
        System.out.println("\nTask 4");
        new BoxList().addExtraPacking();
    }
}