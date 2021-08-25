package ru.netology.manager;

import ru.netology.domain.MovieInfo;

public class MoviesManager {
    private MovieInfo[] movies = new MovieInfo[0];
    private int numberMoviesInPoster = 10;


    public MoviesManager(int numberMoviesInPoster) {
        this.numberMoviesInPoster = numberMoviesInPoster;
    }

    public MoviesManager() {
        this.numberMoviesInPoster = numberMoviesInPoster;
    }

    public void addMovie(MovieInfo movie) {
        int length = movies.length + 1;
        MovieInfo[] tmp = new MovieInfo[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieInfo[] getAll() {
        MovieInfo[] result = new MovieInfo[movies.length];
        for (int i = 0; i < movies.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }


    public MovieInfo[] getLast10Movies() {
        int resultLength;
        if (movies.length < numberMoviesInPoster) {
            resultLength = movies.length;
        } else {
            resultLength = numberMoviesInPoster;
        }
        MovieInfo[] result = new MovieInfo[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }


}
