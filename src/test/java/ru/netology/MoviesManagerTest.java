package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieInfo;
import ru.netology.manager.MoviesManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {
    MovieInfo n1 = new MovieInfo(1, 10, "Name1");
    MovieInfo n2 = new MovieInfo(2, 20, "Name2");
    MovieInfo n3 = new MovieInfo(3, 30, "Name3");
    MovieInfo n4 = new MovieInfo(4, 40, "Name4");
    MovieInfo n5 = new MovieInfo(5, 50, "Name5");
    MovieInfo n6 = new MovieInfo(6, 60, "Name6");
    MovieInfo n7 = new MovieInfo(7, 70, "Name7");
    MovieInfo n8 = new MovieInfo(8, 80, "Name8");
    MovieInfo n9 = new MovieInfo(9, 90, "Name9");
    MovieInfo n10 = new MovieInfo(10, 100, "Name10");
    MovieInfo n11 = new MovieInfo(11, 110, "Name11");

    @Test
    public void shouldAddFirstMovie() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie(n1);

        MovieInfo[] actual = manager.getAll();
        MovieInfo[] expected = new MovieInfo[]{n1};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldAddMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie(n1);
        manager.addMovie(n2);
        manager.addMovie(n3);
        manager.addMovie(n4);

        MovieInfo[] expected = new MovieInfo[]{n4, n3, n2, n1};
        MovieInfo[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldListOf10LastMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie(n2);
        manager.addMovie(n3);
        manager.addMovie(n4);
        manager.addMovie(n5);
        manager.addMovie(n6);
        manager.addMovie(n7);
        manager.addMovie(n8);
        manager.addMovie(n9);
        manager.addMovie(n10);
        manager.addMovie(n11);

        MovieInfo[] expected = new MovieInfo[]{n11, n10, n9, n8, n7, n6, n5, n4, n3, n2};
        MovieInfo[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldListOf3LastMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie(n3);
        manager.addMovie(n4);
        manager.addMovie(n5);

        MovieInfo[] expected = new MovieInfo[]{n5, n4, n3};
        MovieInfo[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldBlankPosterMovies() {
        MoviesManager manager = new MoviesManager();

        MovieInfo[] expected = new MovieInfo[0];
        MovieInfo[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldPosterLess10Movies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie(n1);
        manager.addMovie(n2);
        manager.addMovie(n3);
        manager.addMovie(n4);
        manager.addMovie(n5);
        manager.addMovie(n6);

        MovieInfo[] expected = new MovieInfo[]{n6, n5, n4, n3, n2, n1};
        MovieInfo[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldPosterMore10Movies() {
        MoviesManager manager = new MoviesManager(10);

        manager.addMovie(n1);
        manager.addMovie(n2);
        manager.addMovie(n3);
        manager.addMovie(n4);
        manager.addMovie(n5);
        manager.addMovie(n6);
        manager.addMovie(n7);
        manager.addMovie(n8);
        manager.addMovie(n9);
        manager.addMovie(n10);
        manager.addMovie(n11);



        MovieInfo[] expected = new MovieInfo[]{n11, n10, n9, n8, n7, n6, n5, n4, n3, n2};
        MovieInfo[] actual = manager.getLast10Movies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldInPoster10Movies() {
        MoviesManager manager = new MoviesManager(10);

        manager.addMovie(n1);
        manager.addMovie(n2);
        manager.addMovie(n3);
        manager.addMovie(n4);
        manager.addMovie(n5);
        manager.addMovie(n6);
        manager.addMovie(n7);
        manager.addMovie(n8);
        manager.addMovie(n9);
        manager.addMovie(n10);


        MovieInfo[] expected = new MovieInfo[]{n10, n9, n8, n7, n6, n5, n4, n3, n2, n1};
        MovieInfo[] actual = manager.getLast10Movies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldInPosterLess10Movies() {
        MoviesManager manager = new MoviesManager(10);

        manager.addMovie(n1);
        manager.addMovie(n2);
        manager.addMovie(n3);
        manager.addMovie(n4);
        manager.addMovie(n5);
        manager.addMovie(n6);
        manager.addMovie(n7);
        manager.addMovie(n8);



        MovieInfo[] expected = new MovieInfo[]{n8, n7, n6, n5, n4, n3, n2, n1};
        MovieInfo[] actual = manager.getLast10Movies();

        assertArrayEquals(expected, actual);

    }

}





