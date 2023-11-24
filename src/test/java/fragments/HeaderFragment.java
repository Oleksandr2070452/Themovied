package fragments;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class HeaderFragment extends BasePage {

    private final static String HEADER_LOG0 = "//a//img[contains(@alt, 'The Movie Database')]";
    private final static String MOVIE_MENU = "//a[text()='Movies']";
    private final static String TV_SHOWS_MENU = "//a[text()='TV Shows']";
    private final static String PEOPLE_MENU = "//a[text()='People']";
    private final static String MORE_MENU = "//a[text()='More']";
    private final static String ADD_DROPDOWN = "//span[contains(@class, 'plus white')]";
    private final static String LANGUAGE_DROPDOWN = "//li[@class='translate k-state-border-down']";
    private final static String NOTIFICATIONS_ICON = "//span[contains(@class,'bell')]";
    private final static String PROFILE_ICON = "//a[@title='Profile and Settings']";
    private final static String HEADER_SEARCH = "//span[@class='glyphicons_v2 search blue']";
    private final static String LOGIN_HEADER_BUTTON = "//ul//a[text()='Login']";
    private final static String JOIN_TMDB_HEADER_BUTTON = "//a[text()='Join TMDB']";

    public SelenideElement getHeaderLogo() {
        return getVisibleOfElement(HEADER_LOG0);
    }

    public SelenideElement getMovieMenu() {
        return getVisibleOfElement(MOVIE_MENU);
    }

    public SelenideElement getTVShowsMenu() {
        return getVisibleOfElement(TV_SHOWS_MENU);
    }

    public SelenideElement getPeopleMenu() {
        return getVisibleOfElement(PEOPLE_MENU);
    }

    public SelenideElement getMoreMenu() {
        return getVisibleOfElement(MORE_MENU);
    }

    public SelenideElement getAddDropdown() {
        return getVisibleOfElement(ADD_DROPDOWN);
    }

    public SelenideElement getLanguageDropdown() {
        return getVisibleOfElement(LANGUAGE_DROPDOWN);
    }

    public SelenideElement getNotificationIcon() {
        return getVisibleOfElement(NOTIFICATIONS_ICON);
    }

    public SelenideElement getProfileIcon() {
        return getVisibleOfElement(PROFILE_ICON);
    }

    public SelenideElement getHeaderSearch() {
        return getVisibleOfElement(HEADER_SEARCH);
    }

    public SelenideElement getLoginHeader() {
        return getVisibleOfElement(LOGIN_HEADER_BUTTON);
    }

    public SelenideElement getJoinTMDBHeader() {
        return getVisibleOfElement(JOIN_TMDB_HEADER_BUTTON);
    }
}
