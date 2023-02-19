package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class DataComicBookImpl implements DataComicBook {
    private List<ComicBook> books = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    public List<Seller> sellers = new ArrayList<>();
    public List<Order> orders = new ArrayList<>();

    public DataComicBookImpl() {initData();}

    private void initData() {


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
        customers.add(new Customer(6,"Kiril ",19));

        //книги
        books.add(new ComicBook(1,"The Warrior of Communism","104",700, ComicGenre.Art, 120, "", 2022,100));
        books.add(new ComicBook(2,"Superman vs. the Terminator: Death to the Future","Alan Grant",3050, ComicGenre.Action,117, "", 1999,10));
        books.add(new ComicBook(3,"Star Wars. Escape to Hoth","Al Williamson",960, ComicGenre.Fantasy, 208, "", 1996,15));
        books.add(new ComicBook(4,"Diary of the future","104",410, ComicGenre.Manga, 208, "Volume 1", 2006,20));
        books.add(new ComicBook(5,"Diary of the future","104",320, ComicGenre.Manga, 192, "Volume 2", 2019,21));
        books.add(new ComicBook(6,"Diary of the future","Nik Abrams",390, ComicGenre.Manga, 204, "Mosaic", 2021,7));

       orders.add(new Order(1,2,3,new int[]{4,5,6}));
       orders.add(new Order(2,3,2,new int[]{2}));
       orders.add(new Order(3,5,1,new int[]{2,3,2,2}));

    }

    @Override
    public List<ComicBook> books() {
        return books;
    }

    @Override
    public List<Customer> customers() {
        return customers;
    }

    @Override
    public List<Seller> sellers() {
        return sellers;
    }

    @Override
    public List<Order> orders() {
        return orders;
    }
}
