package ro.cts.clase;

import java.util.List;

public interface AbstractPublication {
    String getTitle();
    List<String> getAuthors();
    String getPublisher();
    String getLanguage();
    String getGenre();
    int getYear();
    long getIsbn();
    float getPrice();
}
