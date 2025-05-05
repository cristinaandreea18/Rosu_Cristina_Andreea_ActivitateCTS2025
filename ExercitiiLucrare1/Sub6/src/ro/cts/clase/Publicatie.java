package ro.cts.clase;

import java.util.List;

public class Publicatie implements AbstractPublication {
    private String Title;
    private List<String> authors;
    private String publisher;
    private String language;

    private String genre;
    private String isbn;
    private int year;
    private float price;

    public Publicatie(String title, List<String> authors, String publisher, String language, String genre, String isbn, int year, float price) {
        Title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.language = language;
        this.genre = genre;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<String> getAuthors() {
        return null;
    }

    @Override
    public String getPublisher() {
        return null;
    }

    @Override
    public String getLanguage() {
        return null;
    }

    @Override
    public String getGenre() {
        return null;
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public long getIsbn() {
        return 0;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Publicatie{");
        sb.append("Title='").append(Title).append('\'');
        sb.append(", authors=").append(authors);
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
