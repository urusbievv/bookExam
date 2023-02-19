package repositories;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profit profit = (Profit) o;
        return count == profit.count && Double.compare(profit.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, price);
    }
}
