package com.cursor.main.java.hw8.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsersFilter {

    public static List <User> buildUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("123@gmail.com", LocalDate.of(2020, 1, 10), "Black Panther"));
        users.add(new User("987@gmail.com", LocalDate.of(2020, 1, 11), "Doctor Strange"));
        users.add(new User("456@gmail.com", LocalDate.of(2020, 1, 14), "Black Panther"));
        users.add(new User("3452gmail.com", LocalDate.of(2020, 1, 17), "Doctor Strange"));
        users.add(new User("876@gmail.com", LocalDate.of(2020, 1, 20), "Doctor Strange"));
        return users;
    }

    public static void usersFilter(){
       List<User> users= buildUserList();
        Map<String,List<String>> teamOfuser =users.stream()
               .filter(user -> user.getLoginDate().isAfter(LocalDate.of(2020,1,5).minusDays(7)))
               .collect(Collectors.groupingBy(User::getTeam,Collectors.mapping(User::getEmail,Collectors.toList())));
        System.out.println(teamOfuser);
    }

}
