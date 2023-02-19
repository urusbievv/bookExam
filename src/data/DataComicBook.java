package data;

import model.ComicBook;
import model.Customer;
import model.Order;
import model.Seller;

import java.util.List;

public interface DataComicBook {
    List<ComicBook> books();
    List<Customer> customers();
    List<Seller> sellers();
    List<Order> orders();
}
