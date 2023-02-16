package model;

public class Order {
    private long id;
    private long customerId; //кому продали
    private long sellerId; // кто продавец
    private long[] comics; // список книг которые мы продали

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public long[] getComics() {
        return comics;
    }

    public void setComics(long[] comics) {
        this.comics = comics;
    }

    public Order(long id, long sellerId, long customerId, long[] comics) {
        this.id = id;
        this.customerId = customerId;
        this.sellerId = sellerId;
        this.comics = comics;
    }
}
