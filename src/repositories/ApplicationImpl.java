package repositories;

import data.DataComicBook;
import model.ComicBook;
import model.ComicGenre;
import model.ComicsAdditionalParameters;
import model.Order;

import java.util.ArrayList;
import java.util.Comparator;

public class ApplicationImpl implements Application {

    private final DataComicBook dataComicBook;

    public ApplicationImpl(DataComicBook dataComicBook) {
        this.dataComicBook = dataComicBook;
    }

    public ComicGenre getPopularGenre() {
        int countArt = 0;
        int countManga = 0;
        int countFantasy = 0;
        int countAction = 0;


        for (Order order : dataComicBook.orders()) {

            countArt += getCountSoldComicGenre(order, ComicGenre.Art);
            countFantasy += getCountSoldComicGenre(order, ComicGenre.Fantasy);
            countManga += getCountSoldComicGenre(order, ComicGenre.Manga);
            countAction += getCountSoldComicGenre(order, ComicGenre.Action);

        }
        ArrayList<ComicsAdditionalParameters> result = new ArrayList<>();

        result.add(new ComicsAdditionalParameters(ComicGenre.Art, countArt));
        result.add(new ComicsAdditionalParameters(ComicGenre.Fantasy, countFantasy));
        result.add(new ComicsAdditionalParameters(ComicGenre.Manga, countManga));
        result.add(new ComicsAdditionalParameters(ComicGenre.Action, countAction));

        result.sort(new Comparator<ComicsAdditionalParameters>() {
            @Override
            public int compare(ComicsAdditionalParameters left, ComicsAdditionalParameters right) {
                return right.getCount() - left.getCount();
            }
        });

        return result.get(0).getGenre();
    }


    public  ArrayList<ComicsAdditionalParameters> getCountSoldComicBooksByGenre() {
        ArrayList<ComicsAdditionalParameters> result = new ArrayList<>();
        int countArt = 0;
        int countManga = 0;
        int countFantasy = 0;
        int countAction = 0;
        for (Order order : dataComicBook.orders()) {
            countArt += getCountSoldComicGenre(order, ComicGenre.Art);
            countFantasy += getCountSoldComicGenre(order, ComicGenre.Fantasy);
            countManga += getCountSoldComicGenre(order, ComicGenre.Manga);
            countAction += getCountSoldComicGenre(order, ComicGenre.Action);
        }
        result.add(new ComicsAdditionalParameters(ComicGenre.Art, countArt));
        result.add(new ComicsAdditionalParameters(ComicGenre.Fantasy, countFantasy));
        result.add(new ComicsAdditionalParameters(ComicGenre.Manga, countManga));
        result.add(new ComicsAdditionalParameters(ComicGenre.Action, countAction));

        return result;
    }

    /**
     * Получить кол-во комиксов в одном заказе по определенному жанру
     *
     * @param order заказ
     * @param genre жанр
     * @return кол-во комиксов
     */
    public int getCountSoldComicGenre(Order order, ComicGenre genre) {
        int count = 0;
        for (int bookId : order.getComics()) {
            ComicBook book = getComicBookId(bookId);
            if (book != null && book.getGenre() == genre)
                count++;
        }
        return count;
    }


    /**
     * получить кол-во и общую стоимость проданного товара для продавца
     *
     * @param sellerId уникальный номер продавца
     * @return кол-во и общую стоимость указанного продавца
     */
    public Profit getProfitSeller(int sellerId) {
        int count = 0;
        double price = 0;
        for (Order order : dataComicBook.orders()) { // идем по списку заказов
            if (order.getSellerId() == sellerId) { // если номер продавца совпадает с указанным номером
                price += getPriceSoldComicBooksOrder(order); // стоимость
                count += order.getComics().length; // кол-во книг
            }
        }
        return new Profit(count, price);
    }

    /**
     * получить кол-во и общую стоимость купленного товара клиента
     *
     * @param customerId уникальный номер клиента
     * @return кол-во и общую стоимость указанного продавца
     */
    public Profit getProfitCustomer(int customerId) {
        int count = 0;
        double price = 0;
        for (Order order : dataComicBook.orders()) { // идем по списку заказов
            if (order.getSellerId() == customerId) { // если номер продавца совпадает с указанным номером
                price += getPriceSoldComicBooksOrder(order); // стоимость
                count += order.getComics().length; // кол-во книг
            }
        }
        return new Profit(count, price);
    }


    // получить общую стоимость всех комиксов
    public double getAllPriceSoldComicBooks() {
        double price = 0;
        for (Order order : dataComicBook.orders()) {
            price += getPriceSoldComicBooksOrder(order);
        }
        return price;
    }


    /**
     * Получить общую стоимость одного заказа
     *
     * @param order заказ по которому считается стоимость
     * @return общую стоимость
     */
    public double getPriceSoldComicBooksOrder(Order order) {
        double price = 0;
        for (int bookId : order.getComics()) {

            ComicBook book = getComicBookId(bookId);
            if (book != null)
                price += book.getPrice();
        }
        return price;
    }


    // получить общее количество комиксов
    public int getCountOfSoldComicBooks() {
        int count = 0;
        for (Order order : dataComicBook.orders())
            count = count + order.getComics().length;

        return count;
    }


    /**
     * Поиск комикса в списке по его уникальному номеру
     *
     * @param id уникальный номер комикса
     * @return найденный комикс
     */
    public ComicBook getComicBookId(int id) {
        ComicBook current = null;

        for (ComicBook book : dataComicBook.books()) {
            if (book.getId() == id) {
                current = book;
                break;
            }
        }
        return current;
    }
}
