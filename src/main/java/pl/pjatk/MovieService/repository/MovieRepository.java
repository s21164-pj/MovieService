package pl.pjatk.MovieService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.MovieService.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findAll();

    Optional<Movie> findById(Long id);

    Movie save(Movie movie);

    void deleteById(Long id);

    void deleteAll();

}
