package tests;

import fragments.FiltersMovieComponent;
import fragments.HeaderComponent;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class SearchTest extends TestInit {

    private static final String MOVIE_NAME = "Barbie";

    @Test
    @Description("Positive: user search movie")
    public void userSearchAMovie() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        SearchPage searchPage = new SearchPage();
        HeaderComponent headerComponent = new HeaderComponent();

        loginPage
                .themoviedbLogin();

        headerComponent
                .clickLogo();

        homePage
                .inputSearchField(MOVIE_NAME)
                .clickSearchButton();

        assertTrue(searchPage.isListOfMovieElementsByTextNameVisible(MOVIE_NAME));

    }

    @Test
    @Description("Positive: user filtering movies after searching")
    public void userFilteringMovies() {


        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        SearchPage searchPage = new SearchPage();
        HeaderComponent headerComponent = new HeaderComponent();
        FiltersMovieComponent filtersMovieComponent = new FiltersMovieComponent();

        loginPage
                .themoviedbLogin();

        headerComponent
                .clickLogo();

        homePage
                .inputSearchField(MOVIE_NAME)
                .clickSearchButton();

        filtersMovieComponent
                .clickOnTVShowsFilter();


        assertTrue(searchPage.isListOfMovieElementsByTextNameVisible(MOVIE_NAME));

        filtersMovieComponent
                .clickKeywordsFilter();

        assertTrue(searchPage.isListOfMovieElementsByTextNameVisible(MOVIE_NAME));

    }
}
