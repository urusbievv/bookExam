import model.*;

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

        //��������
        sellers.add(new Seller(1,"Alina Bolkova",22));
        sellers.add(new Seller(2,"Elena Yashina",30));
        sellers.add(new Seller(3,"Masha Trapesha",21));


        //����������
        customers.add(new Customer(1,"Andrey Ivanov",16));
        customers.add(new Customer(2,"Marita",31));
        customers.add(new Customer(3,"Arina",18));
        customers.add(new Customer(4,"Malika",25));
        customers.add(new Customer(5,"Ivan Petrov",31));
        customers.add(new Customer(1,"Kiril ",19));

        //�����
        books.add(new ComicBook(1,"The Warrior of Communism","104",700, ComicGenre.Fantasy, 120, "", 2022));
        books.add(new ComicBook(2,"Superman vs. the Terminator: Death to the Future","Alan Grant",3050, ComicGenre.Action,117, "", 1999));
        books.add(new ComicBook(3,"Star Wars. Escape to Hoth","Al Williamson",960, ComicGenre.Fantasy, 208, "", 1996));
        books.add(new ComicBook(4,"Diary of the future","104",410, ComicGenre.Manga, 208, "Volume 1", 2006));
        books.add(new ComicBook(5,"Diary of the future","104",320, ComicGenre.Manga, 192, "Volume 2", 2019));
        books.add(new ComicBook(6,"Diary of the future","Nik Abrams",390, ComicGenre.Manga, 204, "Mosaic", 2021));

    }
}
