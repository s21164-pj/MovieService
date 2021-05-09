package pl.pjatk.MovieService.service;

import org.springframework.stereotype.Service;
import pl.pjatk.MovieService.model.Movie;
import pl.pjatk.MovieService.model.MovieCategory;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    public List<Movie> getAllMovies() {
        return List.of(new Movie(1L, "tet", MovieCategory.Comedy, "sdad", "sdsd"),
                new Movie(2L, "tet", MovieCategory.Comedy, "sdad", "sdsd"),
                new Movie(3L, "tet", MovieCategory.Comedy, "sdad", "sdsd"));
    }

    /**
     * so far not much logic
     * task requirements fulfilled
     * if more logic is needed here, give me feedback
     */
    public Optional<Movie> getMovie(Long id) {
        return Optional.empty();
    }

    public Movie addMovie(Movie movie) {
        /*adding new movie here*/
        return movie;
    }

    public Movie updateMovie(Long id, Movie movie) {
        /*updating existing movie of "id" here*/
        return movie;
    }

    public boolean deleteMovie(Long id) {
        if (id > 5) {
            return true;
        } else return false;
    }
}
