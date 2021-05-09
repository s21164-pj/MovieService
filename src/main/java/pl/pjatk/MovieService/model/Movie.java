package pl.pjatk.MovieService.model;

public class Movie {

    private Long id;
    private String name;
    private MovieCategory category;
    private String author;
    private String rating;

    public Movie(Long id, String name, MovieCategory category, String author, String rating) {
        this.id = id;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
