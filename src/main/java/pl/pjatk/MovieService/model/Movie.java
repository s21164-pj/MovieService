package pl.pjatk.MovieService.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private MovieCategory category;
    private String author;
    private int rating;
    @NonNull
    private boolean isAvailable;

    public Movie(String name, MovieCategory category, String author, int rating, boolean isAvailable) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public Movie(String name, MovieCategory category, String author, int rating) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.rating = rating;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
