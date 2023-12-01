package fragments;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class HeaderComponent extends BasePage {

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
    private final static String MOVIE_MENU_POPULAR = "//a[@href='/movie'and text()='Popular']";
    private final static String MOVIE_MENU_NOW_PLAYING = "//a[text()='Now Playing']";
    private final static String MOVIE_MENU_UPCOMING = "//a[text()='Upcoming']";
    private final static String MOVIE_MENU_TOP_RATED = "//a[@href='/movie/top-rated' and text()='Top Rated']";
    private final static String TV_SHOW_MENU_POPULAR = "//a[@href='/tv' and text()='Popular']";
    private final static String TV_SHOW_MENU_AIRING_TODAY = "//a[text()='Airing Today']";
    private final static String TV_SHOW_MENU_ON_TV = "//a[text()='On TV']";
    private final static String TV_SHOW_MENU_TOP_RATED = "//a[@href='/movie/top-rated' and text()='Top Rated']";
    private final static String PEOPLE_MENU_POPULAR_PEOPLE = "//a[text()='Popular People']";
    private final static String MORE_MENU_DISCUSSIONS = "";
    private final static String MORE_MENU_LEADER_BOARD = "";
    private final static String MORE_MENU_SUPPORT = "";
    private final static String MORE_MENU_API = "";
    private final static String LISTS_BUTTON = "//div[@data-role='popup']//p/a[text()='Lists']";
    private final static String WATCHLIST_BUTTON = "//div[@data-role='popup']//p//a[text()='Watchlist']";
    private final static String EDIT_PROFILE_BUTTON = "//div[@data-role='popup']//a[text()='Edit Profile']";

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

    public SelenideElement getMovieMenuPopular() {
        return getVisibleOfElement(MOVIE_MENU_POPULAR);
    }

    public SelenideElement getMovieMenuNowPlaying() {
        return getVisibleOfElement(MOVIE_MENU_NOW_PLAYING);
    }

    public SelenideElement getMovieMenuUpcoming() {
        return getVisibleOfElement(MOVIE_MENU_UPCOMING);
    }

    public SelenideElement getMovieMenuTopRated() {
        return getVisibleOfElement(MOVIE_MENU_TOP_RATED);
    }

    public SelenideElement getTVShowsMenuAiringToday() {
        return getVisibleOfElement(TV_SHOW_MENU_AIRING_TODAY);
    }

    public SelenideElement getTVShowsMenuPopular() {
        return getVisibleOfElement(TV_SHOW_MENU_POPULAR);
    }

    public SelenideElement getTVShowsMenuOnTV() {
        return getVisibleOfElement(TV_SHOW_MENU_ON_TV);
    }

    public SelenideElement getTVShowsMenuTopRated() {
        return getVisibleOfElement(TV_SHOW_MENU_TOP_RATED);
    }

    public SelenideElement getPeopleMenuPopularPeople() {
        return getVisibleOfElement(PEOPLE_MENU_POPULAR_PEOPLE);
    }

    public SelenideElement getMoreMenuDiscussion() {
        return getVisibleOfElement(MORE_MENU_DISCUSSIONS);
    }

    public SelenideElement getMoreMenuLeaderBoard() {
        return getVisibleOfElement(MORE_MENU_LEADER_BOARD);
    }

    public SelenideElement getMoreMenuSupport() {
        return getVisibleOfElement(MORE_MENU_SUPPORT);
    }

    public SelenideElement getMoreMenuAPI() {
        return getVisibleOfElement(MORE_MENU_API);
    }

    public SelenideElement getListsButton() {
        return getVisibleOfElement(LISTS_BUTTON);
    }

    public SelenideElement getWatchlistButton() {
        return getVisibleOfElement(WATCHLIST_BUTTON);
    }

    public HeaderComponent clickLogo() {
        getHeaderLogo().click();
        return this;
    }

    public HeaderComponent clickLoginHeader() {
        getLoginHeader().click();
        return this;
    }

    public HeaderComponent clickAccountProfile() {
        getProfileIcon().click();
        return this;
    }

    public HeaderComponent clickListsButton() {
        getListsButton().click();
        return this;
    }

    public HeaderComponent clickWatchlistButton() {
        getWatchlistButton().click();
        return this;
    }
    protected SelenideElement getEditProfileButton() {
        return getVisibleOfElement(EDIT_PROFILE_BUTTON);
    }

    public HeaderComponent clickEditProfileButton() {
        getEditProfileButton().click();
        return this;
    }
}
