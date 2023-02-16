package model;

public  class ComicBook {
    private double id;
    private String title;
    private String author;
    private double price;
    private ComicGenre genre;

    private int  yearPublication;

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }



    public void setId(double id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(ComicGenre genre) {
        this.genre = genre;
    }

    public double getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public ComicGenre getGenre() {
        return genre;
    }

    public ComicBook(double id, String title, String author, double price, ComicGenre genre, int yearPublication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.yearPublication = yearPublication;
    }
}
