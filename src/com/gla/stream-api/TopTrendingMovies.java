import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " - " + rating + " (" + year + ")";
    }
}

public class TopTrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie1", 4.5, 2022),
                new Movie("Movie2", 4.8, 2023),
                new Movie("Movie3", 4.2, 2021),
                new Movie("Movie4", 4.9, 2024),
                new Movie("Movie5", 4.7, 2023),
                new Movie("Movie6", 4.3, 2022)
        );

        movies.stream()
                .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
                .limit(5)
                .forEach(System.out::println);
    }
}
