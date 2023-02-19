package model;

import model.ComicBook;
import model.ComicGenre;

public class ComicsAdditionalParameters {

    private ComicGenre genre;
    private int count;

    public ComicsAdditionalParameters(ComicGenre genre, int count) {
        this.genre = genre;
        this.count = count;
    }

    public ComicGenre getGenre() {
        return genre;
    }



    public void setGenre(ComicGenre genre) {
        this.genre = genre;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
