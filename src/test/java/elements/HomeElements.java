package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class HomeElements extends BasePage {

    private final static String SEARCH_INPUT = "//input[@id='inner_search_v4']";
    private final static String SEARCH_BUTTON = "//input[@value='Search']";
    private final static String TOGGLE_TODAY = "//a[@data-group='today']";
    private final static String TOGGLE_THIS_WEEK = "//a[@data-group='this week']";
    private final static String FIRST_MOVIE_ITEM = "(//img[@class='poster'][1])";
    private final static String ACCEPT_ALL_COOKIES_BUTTON = "//button[@id='onetrust-accept-btn-handler']";

    public SelenideElement getSearchInput() {
        return getVisibleOfElement(SEARCH_INPUT);
    }

    public SelenideElement getSearchButton() {
        return getVisibleOfElement(SEARCH_BUTTON);
    }

    public SelenideElement getFirstMovieItem() {
        return getVisibleOfElement(FIRST_MOVIE_ITEM);
    }

    public SelenideElement getAcceptAllCookiesButton() {
        return getVisibleOfElement(ACCEPT_ALL_COOKIES_BUTTON);
    }
}
