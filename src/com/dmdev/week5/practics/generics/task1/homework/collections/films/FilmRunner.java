package com.dmdev.week5.practics.generics.task1.homework.collections.films;


/**
 * Даны 2 класса:
 * <p>
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * <p>
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив, где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * <p>
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * <p>
 * - добавлять в него новый фильм
 * <p>
 * - получить все фильмы по переданному году
 * <p>
 * - получить все фильмы по переданному году и месяцу
 * <p>
 * - получить все фильмы по переданному жанру
 * <p>
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * <p>
 * Учесть следующее:
 * <p>
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * <p>
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * <p>
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */

public class FilmRunner {

    public static void main(String[] args) {

        Film film = new Film(1, 1997, 12, "триллер", 10);
        Film film1 = new Film(2, 1997, 10, "комедия", 9);
        Film film2 = new Film(3, 2000, 3, "ужасы", 5);
        Film film3 = new Film(4, 2002, 3, "комедия", 10);
        Film film4 = new Film(5, 2002, 1, "исторический", 7);
        Film film5 = new Film(6, 2010, 10, "драма", 8);

        Cinema cinema = new Cinema();

        cinema.addNewFilm(film);
        cinema.addNewFilm(film1);
        cinema.addNewFilm(film2);
        cinema.addNewFilm(film3);
        cinema.addNewFilm(film4);
        cinema.addNewFilm(film5);

        cinema.print();
        cinema.printAllMoviesByGivenYear(1997);
        cinema.printAllMoviesByGivenYearAndMonth(1997, 12);
        cinema.printAllMoviesByGenre("комедия");
        cinema.printTopFilms(3);
    }


}
