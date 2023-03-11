package ru.netology;

import ru.netology.domain.MovieItem;
import ru.netology.repository.MoviesRepository;

public class MovieManager {
    private MoviesRepository repo;

    public MovieManager(MoviesRepository repo) {
        this.repo = repo;
    }

    public void addNewFilm(MovieItem movie) {
        repo.save(movie);
    }

    public MovieItem[] filmReverse() {
        MovieItem[] all = repo.findAll();
        MovieItem[] reversed = new MovieItem[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public MovieItem[] findAll() {
        return repo.findAll();
    }


}

// МЕНЕДЖЕР БЕЗ Репозитория:
//    private String[] movies = new String[0];
//    private int limit;
//
//    public MovieManager() {
//        this.limit = 10;
//    }
//
//    public MovieManager(int limit) {
//        this.limit = limit;
//    }
//
//    public void addNewFilm(String poster) {
//        String[] tmp = new String[movies.length + 1];
//        for (int i = 0; i < movies.length; i++) {
//            tmp[i] = movies[i];
//        }
//        tmp[tmp.length - 1] = poster;
//        movies = tmp;
//    }
//
//    public String[] findAll() {
//        return movies;
//    }
//
//    public String[] findLast() {
//        int tmpLength;
//        if (movies.length < limit) {
//            tmpLength = movies.length;
//        } else {
//            tmpLength = limit;
//        }
//
//        String[] tmp = new String[tmpLength];
//        for (int i = 0; i < tmpLength; i++) {
//            tmp[i] = movies[movies.length - 1 - i];
//        }
//        return tmp;
//
//    }
//
//}
