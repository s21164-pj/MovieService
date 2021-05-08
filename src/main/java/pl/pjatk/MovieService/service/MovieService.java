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

    public Optional<Movie> getMovie(Long id) {
        return Optional.empty();
    }
}
