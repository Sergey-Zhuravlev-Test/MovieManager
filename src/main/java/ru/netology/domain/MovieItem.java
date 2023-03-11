package ru.netology.domain;

public class MovieItem {
    private int movieId;
    private String movieName;
    private String movieGenre;
    private int date;

    public MovieItem(int movieId, String movieName, String movieGenre, int date) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.date = date;
    }


    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
