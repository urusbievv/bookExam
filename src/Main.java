import data.DataComicBook;
import repositories.Application;
import repositories.ApplicationImpl;
import data.DataComicBookImpl;
import repositories.Adatapter;

public class Main {


    public static void main(String[] args) {
        DataComicBook dataComicBookList = new DataComicBookImpl();
        Application application = new ApplicationImpl(dataComicBookList);
        Adatapter adatapter = new Adatapter(application, dataComicBookList);
        adatapter.show();


    }

}
