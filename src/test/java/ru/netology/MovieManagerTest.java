package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    @Test
    public void addNewFilm() {
        MovieManager films = new MovieManager();

        films.addNewFilm("one");
        films.addNewFilm("two");
        films.addNewFilm("three");

        String[] expected = {"one", "two", "three"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addPosterWithoutFilm() {
        MovieManager films = new MovieManager();


        String[] expected = {};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addPosterForOneFilm() {
        MovieManager films = new MovieManager();

        films.addNewFilm("one");

        String[] expected = {"one"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showTenFilms() {
        MovieManager films = new MovieManager();

        films.addNewFilm("one");
        films.addNewFilm("two");
        films.addNewFilm("three");
        films.addNewFilm("four");
        films.addNewFilm("five");
        films.addNewFilm("six");
        films.addNewFilm("seven");
        films.addNewFilm("eight");
        films.addNewFilm("nine");
        films.addNewFilm("ten");

        String[] expected = {"ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showNineFilms() {
        MovieManager films = new MovieManager();

        films.addNewFilm("one");
        films.addNewFilm("two");
        films.addNewFilm("three");
        films.addNewFilm("four");
        films.addNewFilm("five");
        films.addNewFilm("six");
        films.addNewFilm("seven");
        films.addNewFilm("eight");
        films.addNewFilm("nine");

        String[] expected = {"nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showTenFilmsOverLimit() {
        MovieManager films = new MovieManager();

        films.addNewFilm("one");
        films.addNewFilm("two");
        films.addNewFilm("three");
        films.addNewFilm("four");
        films.addNewFilm("five");
        films.addNewFilm("six");
        films.addNewFilm("seven");
        films.addNewFilm("eight");
        films.addNewFilm("nine");
        films.addNewFilm("ten");
        films.addNewFilm("eleven");

        String[] expected = {"eleven", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setLimitFilms() {
        MovieManager films = new MovieManager(12);

        films.addNewFilm("one");
        films.addNewFilm("two");
        films.addNewFilm("three");
        films.addNewFilm("four");
        films.addNewFilm("five");
        films.addNewFilm("six");
        films.addNewFilm("seven");
        films.addNewFilm("eight");
        films.addNewFilm("nine");
        films.addNewFilm("ten");
        films.addNewFilm("eleven");
        films.addNewFilm("twelve");

        String[] expected = {"twelve", "eleven", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}