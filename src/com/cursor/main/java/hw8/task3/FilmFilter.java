package com.cursor.main.java.hw8.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilmFilter {

    public static List<Film> buildFirstFilmList() {
        List<Film> firstList = new ArrayList<>();
        firstList.add(new Film(FilmGenre.CARTOON, 125.00));
        firstList.add(new Film(FilmGenre.COMEDY, 70.00));
        firstList.add(new Film(FilmGenre.MELODRAMA, 50.00));
        firstList.add(new Film(FilmGenre.FANTASY, 50.00));
        firstList.add(new Film(FilmGenre.CARTOON, 110.00));
        return firstList;
    }

    public static List<Film> buildSecondFilmList() {
        List<Film> secondList = new ArrayList<>();
        secondList.add(new Film(FilmGenre.MELODRAMA, 85.00));
        secondList.add(new Film(FilmGenre.FANTASY, 80.00));
        secondList.add(new Film(FilmGenre.COMEDY, 75.00));
        secondList.add(new Film(FilmGenre.FANTASY, 50.00));
        secondList.add(new Film(FilmGenre.COMEDY, 95.00));
        return secondList;
    }

    public void demonstrationFilterFilms() {
        List<Film> allFilms = Stream
                .concat(buildFirstFilmList().stream(), buildSecondFilmList().stream())
                .collect(Collectors.toList());

        Map<FilmGenre, Double> genrePriceMap = allFilms.stream()
                .collect(Collectors.groupingBy(Film::getFilmGenre, Collectors.averagingDouble(Film::getPrice)));
        System.out.println("Average ticket price per genre: " + genrePriceMap);

        Map<FilmGenre, Long> genreCountMap = allFilms.stream()
                .collect(Collectors.groupingBy(Film::getFilmGenre, Collectors.counting()));
        System.out.println("Number of films per genre: " + genreCountMap);
    }
}
