package model;

public class ComicBook {
    private int id;
    private String title;
    private String author;
    private double price;
    private ComicGenre genre;
    private long pages;
    private String volume;
    private int  yearPublication;
    private int instances;

    public ComicBook(int id, String title, String author, double price, ComicGenre genre, long pages, String volume, int yearPublication, int instances) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.pages = pages;
        this.volume = volume;
        this.yearPublication = yearPublication;
        this.instances = instances;
    }

    public int getInstances() {
        return instances;
    }

    public void setInstances(int instances) {
        this.instances = instances;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ComicGenre getGenre() {
        return genre;
    }

    public void setGenre(ComicGenre genre) {
        this.genre = genre;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }


}
