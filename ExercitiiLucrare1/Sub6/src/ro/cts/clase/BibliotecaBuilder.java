package ro.cts.clase;

import java.util.List;

public class BibliotecaBuilder implements Builder {
    private String title;
    private List<String> authors;
    private String publisher;
    private String language;
    private String genre;
    private String isbn;
    private int year;
    private float price;
    private String libraryName;

    public BibliotecaBuilder(String libraryName) {
        this.libraryName = libraryName;
    }

    public BibliotecaBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BibliotecaBuilder setAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    public BibliotecaBuilder setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BibliotecaBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    public BibliotecaBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public BibliotecaBuilder setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BibliotecaBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public BibliotecaBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    @Override
    public Publicatie build() {
        return (new Publicatie(title,authors,publisher,language,genre,isbn,year,price));
    }
//
//    @Override
//    public BibliotecaBuilder setTitle(String title) {
//        this.title = title;
//        return this;
//    }
//
//    @Override
//    public BibliotecaBuilder setAuthors(List<String> authors) {
//        this.authors = authors;
//        return this;
//    }
//
//    @Override
//    public BibliotecaBuilder setPublisher(String publisher) {
//        return null;
//    }
//
//    @Override
//    public BibliotecaBuilder setLanguage(String language) {
//        return null;
//    }
//
//    @Override
//    public BibliotecaBuilder setGenre(String genre) {
//        return null;
//    }
//
//    @Override
//    public BibliotecaBuilder setIsbn(String isbn) {
//        return null;
//    }
//
//    @Override
//    public BibliotecaBuilder setYear(int year) {
//        return null;
//    }
//
//    @Override
//    public BibliotecaBuilder setPrice(float price) {
//        return null;
//    }
}
