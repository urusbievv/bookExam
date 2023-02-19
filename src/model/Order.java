package model;

public class Order {
    private int id;
    private int customerId; //кому продали
    private int sellerId; // кто продавец
    private int[] comics; // список книг которые мы продали

    public Order(int id, int customerId, int sellerId, int[] comics) {
        this.id = id;
        this.customerId = customerId;
        this.sellerId = sellerId;
        this.comics = comics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int[] getComics() {
        return comics;
    }

    public void setComics(int[] comics) {
        this.comics = comics;
    }
}
