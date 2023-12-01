package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class WatchlistElements extends BasePage {

    private final static String TV_BUTTON = "//a[@data-media-type='tv']";
    private final static String MOVIE_HEADER = "//h2[text()='Family Switch']";
    private final static String REMOVE_BUTTON = "//span[@class='remove wrapper']";
    private final static String YOU_HAVE_NOT_CREATED_ANY_WATCHLIST_TITLE = "//div[@class='items_wrapper']/p";

    protected SelenideElement getTVButton() {
        return getVisibleOfElement(TV_BUTTON);
    }

    public SelenideElement getMovieHeader() {
        return getVisibleOfElement(MOVIE_HEADER);
    }

    protected SelenideElement getRemoveButton() {
        return getVisibleOfElement(REMOVE_BUTTON);
    }

    public SelenideElement getYouHaveCreatedAnyWatchlistTitle() {
        return getVisibleOfElement(YOU_HAVE_NOT_CREATED_ANY_WATCHLIST_TITLE);
    }

}
