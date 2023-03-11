package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

public class MoviesRepositoryTest {

    MovieItem Film1 = new MovieItem(111, "ONE", "comedy", 25 / 5 / 2022);
    MovieItem Film2 = new MovieItem(222, "TWO", "drama", 12 / 11 / 2020);
    MovieItem Film3 = new MovieItem(333, "THREE", "thriller", 18 / 10 / 1998);


    @Test

    public void filmsAdd() {
        MoviesRepository repo = new MoviesRepository();
        repo.save(Film1);
        repo.save(Film2);
        repo.save(Film3);

        MovieItem[] expected = {Film1, Film2, Film3};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void filmRemove() {
        MoviesRepository repo = new MoviesRepository();
        repo.save(Film1);
        repo.save(Film2);
        repo.save(Film3);
        repo.removeByID(222);

        MovieItem[] expected = {Film1, Film3};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void filmFind() {
        MoviesRepository repo = new MoviesRepository();
        repo.save(Film1);
        repo.save(Film2);
        repo.save(Film3);
        repo.findByID(333);

        MovieItem[] expected = {Film3};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void removeAllFilms() {
        MoviesRepository repo = new MoviesRepository();
        repo.save(Film1);
        repo.save(Film2);
        repo.save(Film3);
        repo.removeAll();

        MovieItem[] expected = {};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}