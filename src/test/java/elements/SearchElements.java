package elements;

import com.codeborne.selenide.ElementsCollection;
import common.BasePage;

public class SearchElements extends BasePage {

    private final static String MOVIE_LIST = "//a[@data-media-type='movie']//h2";

    protected ElementsCollection getMovieList() {
        return getListPresenceOfElements(MOVIE_LIST);
    }
}
