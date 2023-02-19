package repositories;

import data.DataComicBook;
import model.ComicsAdditionalParameters;
import model.Customer;
import model.Seller;
import repositories.Application;

import java.util.ArrayList;

public class Adatapter {

    private final Application application;
    private final DataComicBook dataComicBookList;

    public Adatapter(Application application, DataComicBook dataComicBookList) {
        this.application = application;
        this.dataComicBookList = dataComicBookList;
    }



    public void show(){
        String comicsInfo = String.format("Total number of books sum: %d for the amount of %f",
                application.getCountOfSoldComicBooks(), application.getAllPriceSoldComicBooks());
        System.out.println(comicsInfo);

        //2
        for(Seller seller: dataComicBookList.sellers())
            System.out.println(seller.getName()+" sold out " +
                    application.getProfitSeller((int) seller.getId()).toString());
        System.out.println();
        for(Customer customer: dataComicBookList.customers())
            System.out.println(customer.getName()+" buy out " + application.getProfitCustomer((int) customer.getId()).toString());

        //3
        ArrayList<ComicsAdditionalParameters> soldComicsCount = application.getCountSoldComicBooksByGenre();
//
//
        String soldComicsStr = "By genre %s of books sold %d ";
//
        for(ComicsAdditionalParameters comicsAdditional: soldComicsCount){
            System.out.println(
                    String.format(soldComicsStr,comicsAdditional.getGenre().name(),comicsAdditional.getCount())
            );
        }

        System.out.println();
        //4
        String strGenre = "Popular %s ";
        System.out.println(String.format(strGenre, application.getPopularGenre()));

    }
}
