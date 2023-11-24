package fragments;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class SearchResultComponent extends BasePage {

    private final static String MOVIE_FILTER = "//a[@id='movie']";
    private final static String TV_SHOWS_FILTER = "//a[@id='tv']";
    private final static String PEOPLE_FILTER = "//a[@id='person']";
    private final static String COLLECTION_FILTER = "//a[@id='collection']";
    private final static String COMPANIES_FILTER = "//a[@id='company']";
    private final static String KEYWORD_FILTER = "//a[@id='keyword']";
    private final static String NETWORKS_FILTER = "//a[@id='network']";

    public SelenideElement getMovieFilter() {
        return getVisibleOfElement(MOVIE_FILTER);
    }

    public SelenideElement getTVShowsFilter() {
        return getVisibleOfElement(TV_SHOWS_FILTER);
    }

    public SelenideElement getPeopleFilter() {
        return getVisibleOfElement(PEOPLE_FILTER);
    }

    public SelenideElement getCollectionFilter() {
        return getVisibleOfElement(COLLECTION_FILTER);
    }

    public SelenideElement getCompaniesFilter() {
        return getVisibleOfElement(COMPANIES_FILTER);
    }

    public SelenideElement getKeywordFilter() {
        return getVisibleOfElement(KEYWORD_FILTER);
    }

    public SelenideElement getNetworksFilter() {
        return getVisibleOfElement(NETWORKS_FILTER);
    }
}
