package com.dmdev.week5.practics.generics.task1.homework.collections.films;


public class Film {

    private final int id;
    private final int yearPublishing;
    private final int monthPublishing;
    private final String genre;
    private final int rating;

    public Film(int id, int yearPublishing, int monthPublishing, String genre, int rating) {
        this.id = id;
        this.yearPublishing = yearPublishing;
        this.monthPublishing = monthPublishing;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public int getMonthPublishing() {
        return monthPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
               "id=" + id +
               ", yearPublishing=" + yearPublishing +
               ", monthPublishing=" + monthPublishing +
               ", genre='" + genre + '\'' +
               ", rating=" + rating +
               '}';
    }
}
