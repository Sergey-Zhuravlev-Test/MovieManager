package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import ru.netology.domain.MovieItem;
import ru.netology.repository.MoviesRepository;

public class MovieManagerTest {


    MoviesRepository repo = Mockito.mock(MoviesRepository.class);
    MovieManager manager = new MovieManager(repo);

    MovieItem Film1 = new MovieItem(111, "ONE", "comedy", 25 / 5 / 2022);
    MovieItem Film2 = new MovieItem(222, "TWO", "drama", 12 / 11 / 2020);
    MovieItem Film3 = new MovieItem(333, "THREE", "thriller", 18 / 10 / 1998);


    @Test
    public void mockitoCreateMoviesList() {

        MovieItem[] movies = {Film1, Film2, Film3};
        doReturn(movies).when(repo).findAll();

        MovieItem[] expected = {Film1, Film2, Film3};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void mockitoReverseMoviesList() {

        MovieItem[] movies = {Film1, Film2, Film3};
        doReturn(movies).when(repo).findAll();

        MovieItem[] expected = {Film3, Film2, Film1};
        MovieItem[] actual = manager.filmReverse();

        Assertions.assertArrayEquals(expected, actual);

    }
}
// ТЕСТЫ БЕЗ Репозитория:
//  MoviesRepository repo = new MoviesRepository();
//    @BeforeEach
//    public void setup() {
//        manager.addNewFilm(Film1);
//        manager.addNewFilm(Film2);
//        manager.addNewFilm(Film3);
//    }
//    @Test
//    public void addNewFilm() {
//        MovieManager films = new MovieManager();
//
//        films.addNewFilm("one");
//        films.addNewFilm("two");
//        films.addNewFilm("three");
//
//        String[] expected = {"one", "two", "three"};
//        String[] actual = films.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void addPosterWithoutFilm() {
//        MovieManager films = new MovieManager();
//
//
//        String[] expected = {};
//        String[] actual = films.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void addPosterForOneFilm() {
//        MovieManager films = new MovieManager();
//
//        films.addNewFilm("one");
//
//        String[] expected = {"one"};
//        String[] actual = films.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void showTenFilms() {
//        MovieManager films = new MovieManager();
//
//        films.addNewFilm("one");
//        films.addNewFilm("two");
//        films.addNewFilm("three");
//        films.addNewFilm("four");
//        films.addNewFilm("five");
//        films.addNewFilm("six");
//        films.addNewFilm("seven");
//        films.addNewFilm("eight");
//        films.addNewFilm("nine");
//        films.addNewFilm("ten");
//
//        String[] expected = {"ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
//        String[] actual = films.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void showNineFilms() {
//        MovieManager films = new MovieManager();
//
//        films.addNewFilm("one");
//        films.addNewFilm("two");
//        films.addNewFilm("three");
//        films.addNewFilm("four");
//        films.addNewFilm("five");
//        films.addNewFilm("six");
//        films.addNewFilm("seven");
//        films.addNewFilm("eight");
//        films.addNewFilm("nine");
//
//        String[] expected = {"nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
//        String[] actual = films.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void showTenFilmsOverLimit() {
//        MovieManager films = new MovieManager();
//
//        films.addNewFilm("one");
//        films.addNewFilm("two");
//        films.addNewFilm("three");
//        films.addNewFilm("four");
//        films.addNewFilm("five");
//        films.addNewFilm("six");
//        films.addNewFilm("seven");
//        films.addNewFilm("eight");
//        films.addNewFilm("nine");
//        films.addNewFilm("ten");
//        films.addNewFilm("eleven");
//
//        String[] expected = {"eleven", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two"};
//        String[] actual = films.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void setLimitFilms() {
//        MovieManager films = new MovieManager(12);
//
//        films.addNewFilm("one");
//        films.addNewFilm("two");
//        films.addNewFilm("three");
//        films.addNewFilm("four");
//        films.addNewFilm("five");
//        films.addNewFilm("six");
//        films.addNewFilm("seven");
//        films.addNewFilm("eight");
//        films.addNewFilm("nine");
//        films.addNewFilm("ten");
//        films.addNewFilm("eleven");
//        films.addNewFilm("twelve");
//
//        String[] expected = {"twelve", "eleven", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
//        String[] actual = films.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }