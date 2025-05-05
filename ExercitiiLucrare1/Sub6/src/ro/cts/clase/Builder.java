package ro.cts.clase;

import java.util.List;

public interface Builder {
    Publicatie build();

    BibliotecaBuilder setTitle(String title);

    BibliotecaBuilder setAuthors(List<String> authors);

    BibliotecaBuilder setPublisher(String publisher);

    BibliotecaBuilder setLanguage(String language);

    BibliotecaBuilder setGenre(String genre);

    BibliotecaBuilder setIsbn(String isbn);

    BibliotecaBuilder setYear(int year);

    BibliotecaBuilder setPrice(float price);
}




