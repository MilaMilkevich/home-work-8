package com.cursor.main.java.hw8.task3;

public class Film {
    private FilmGenre filmGenre;
    private double price;

    public Film(FilmGenre filmGenre, double price) {
        this.filmGenre = filmGenre;
        this.price = price;
    }

    public FilmGenre getFilmGenre() {
        return filmGenre;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmGenre=" + filmGenre +
                ", price=" + price +
                '}';
    }
}
