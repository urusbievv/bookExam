package repositories;

import model.ComicBook;
import model.ComicGenre;
import model.ComicsAdditionalParameters;

import java.util.ArrayList;

public interface Application {
    int getCountOfSoldComicBooks();
    double getAllPriceSoldComicBooks();
    Profit getProfitSeller(int sellerId);
    Profit getProfitCustomer(int customerId);
    ComicGenre getPopularGenre();
    ArrayList<ComicsAdditionalParameters> getCountSoldComicBooksByGenre();

    ComicBook getComicBookId(int id);

    String getComicBookAll();

}
