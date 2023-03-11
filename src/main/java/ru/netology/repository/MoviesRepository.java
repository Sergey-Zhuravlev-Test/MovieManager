package ru.netology.repository;

import ru.netology.domain.MovieItem;

public class MoviesRepository {
    private MovieItem[] movies = new MovieItem[0];


    public void save(MovieItem movie) {
        MovieItem[] tmp = new MovieItem[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public MovieItem[] findAll() {
        return movies;

    }

    public void findByID(int id) {
        MovieItem[] tmp = new MovieItem[1];
        int copyToIndex = 0;
        for (MovieItem movie : movies) {
            if (movie.getMovieId() == id) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
        }
        movies = tmp;

    }

    public void removeByID(int id) {
        MovieItem[] tmp = new MovieItem[movies.length - 1];
        int copyToIndex = 0;
        for (MovieItem movie : movies) {
            if (movie.getMovieId() != id) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
        }
        movies = tmp;

    }

    public void removeAll() {
        movies = new MovieItem[0];

    }
}
