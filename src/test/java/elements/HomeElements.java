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
    private final static String LOGGED_OUT_HEADER = "//h2[text()='Logged Out!']";

    protected SelenideElement getSearchInput() {
        return getVisibleOfElement(SEARCH_INPUT);
    }

    protected SelenideElement getSearchButton() {
        return getVisibleOfElement(SEARCH_BUTTON);
    }

    protected SelenideElement getFirstMovieItem() {
        return getVisibleOfElement(FIRST_MOVIE_ITEM);
    }

    protected SelenideElement getAcceptAllCookiesButton() {
        return getVisibleOfElement(ACCEPT_ALL_COOKIES_BUTTON);
    }

    public SelenideElement getLoggedOutHeader() {
        return getVisibleOfElement(LOGGED_OUT_HEADER);
    }
}
