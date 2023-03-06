package com.dmdev.week5.practics.generics.task1.homework.collections.films;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {

    private final Map<Integer, Set<Film>> cinema = new TreeMap<>();

    public void addNewFilm(Film film) {

        if (cinema.containsKey(film.getYearPublishing())) {
            for (Map.Entry<Integer, Set<Film>> entry : cinema.entrySet()) {
                if (entry.getKey() == film.getYearPublishing()) {
                    Set<Film> filmList = entry.getValue();
                    filmList.add(film);
                    cinema.put(film.getYearPublishing(), filmList);
                }
            }
        } else {

            Set<Film> filmList = new LinkedHashSet<>();
            filmList.add(film);
            cinema.put(film.getYearPublishing(), filmList);
        }
    }


    public Map<Integer, Set<Film>> getCinema() {
        return cinema;
    }

    @Override
    public String toString() {
        return "Cinema{" +
               "cinema=" + cinema +
               '}';
    }

    public void printAllMoviesByGivenYear(int year) {
        for (Map.Entry<Integer, Set<Film>> integerSetEntry : cinema.entrySet()) {
            if (Objects.equals(integerSetEntry.getKey(), year)) {
                System.out.println(integerSetEntry.getValue());
            } else {
                System.out.println("нет фильмов по указанной дате");
            }
        }
    }

    public void printAllMoviesByGivenYearAndMonth(int year, int month) {
        for (Map.Entry<Integer, Set<Film>> integerSetEntry : cinema.entrySet()) {
            if (Objects.equals(integerSetEntry.getKey(), year) && (isMonth(month, integerSetEntry.getValue()))) {
                System.out.println(integerSetEntry.getValue());
            } else {
                System.out.println("нет фильмов по указанной дате");
            }
        }

    }

    private boolean isMonth(int month, Set<Film> value) {
        for (Film film : value) {
            return (film.getMonthPublishing() == month);
        }
        return false;
    }

    public void printAllMoviesByGenre(String genre) {
        Set<Film> resultFilms = new LinkedHashSet<>();

        for (Map.Entry<Integer, Set<Film>> integerSetEntry : cinema.entrySet()) {
            for (Film film : integerSetEntry.getValue()) {
                if (film.getGenre() == genre) {
                    System.out.println(integerSetEntry.getValue());
                } else {
                    System.out.println("нет фильмов по указанному жанру");
                }
            }

        }
    }

    public void printTopFilms(int top) {
        List<Film> listFilm = new ArrayList<>();

        for (Map.Entry<Integer, Set<Film>> integerSetEntry : cinema.entrySet()) {
            listFilm.addAll(integerSetEntry.getValue());
            listFilm.sort(Comparator.comparing(Film::getGenre));
            for (int i = 0; i <= top; i++) {
                System.out.println(listFilm.get(i));
            }
        }
    }

    public void print() {
        for (Map.Entry<Integer, Set<Film>> integerSetEntry : cinema.entrySet()) {
            System.out.println(integerSetEntry);
            System.out.println("*****");
        }
    }

}
