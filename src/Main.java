import model.ComicBook;
import model.Customer;
import model.Order;
import model.Seller;

import java.util.ArrayList;

public class Main {

    static ArrayList<ComicBook> books = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Seller> sellers = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println();
    }


    public static void initData() {

        //продавцы
        sellers.add(new Seller(1,"Alina Bolkova",22));
        sellers.add(new Seller(2,"Elena Yashina",30));
        sellers.add(new Seller(3,"Masha Trapesha",21));


        //покупатели
        customers.add(new Customer(1,"Andrey Ivanov",16));
        customers.add(new Customer(2,"Marita",31));
        customers.add(new Customer(3,"Arina",18));
        customers.add(new Customer(4,"Malika",25));
        customers.add(new Customer(5,"Ivan Petrov",31));
        customers.add(new Customer(1,"Kiril ",19));


    }
}
