package repositories;

public class Profit {

    private int count; // кол-во проданного товара
    private double price;  // общая сумма проданного товара

    public Profit(int count, double price) {
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "all " + count +
                " comics in the amount of " + price;
    }
}
