package tests;

import fragments.HeaderComponent;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.*;

public class HomeTest extends TestInit {

    private final static String LIST_NAME = "Test";
    private final static String LIST_DESCRIPTION = "Only for testing";
    private final static String MOVIE_NAME = "Doctor Who";
    private final static String MOVIE_DESCRIPTION = "Test movie description";
    private final static String TITLE = "You haven't created any lists.";
    private final static String WARNING_LOGIN_MESSAGE = "Login to create and edit custom lists";

    @Test
    @Description("Positive: not logged user cannot add list")
    public void userCannotAddList() {

        HomePage homePage = new HomePage();
        MoviePage moviePage = new MoviePage();

        homePage
                .clickAcceptAllCookies()
                .clickFirstMovieItemTrending();

        moviePage
                .clickAddToListButton();

        assertTrue(moviePage.getWarningLoginMessage().getText().contains(WARNING_LOGIN_MESSAGE));

    }

    @Test
    @Description("Positive: existing user can create list and add movie")
    public void userCreateList() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        HeaderComponent headerComponent = new HeaderComponent();
        MoviePage moviePage = new MoviePage();
        CreateListPage createListPage = new CreateListPage();
        AddEditItemsPage addEditItemsPage = new AddEditItemsPage();
        EditListPage editListPage = new EditListPage();
        ListsPage listsPage = new ListsPage();


        loginPage
                .themoviedbLogin();

        headerComponent
                .clickLogo();

        homePage
                .clickAcceptAllCookies()
                .clickFirstMovieItemTrending();

        moviePage
                .clickAddToListButton()
                .clickCreateNewList();

        createListPage
                .inputName(LIST_NAME)
                .inputDescription(LIST_DESCRIPTION)
                .clickContinueButton();

        addEditItemsPage
                .inputAddItem(MOVIE_NAME)
                .inputDescription(MOVIE_DESCRIPTION);

        editListPage
                .clickSaveButton();

        headerComponent
                .clickLogo()
                .clickAccountProfile()
                .clickListsButton();

        listsPage
                .clickListItem();

        assertTrue(listsPage.getListItem().isDisplayed());
        assertTrue(listsPage.getListItem().getText().contains(LIST_NAME));
    }

    @Test
    @Description("Positive: user delete list")
    public void userDeleteList() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        HeaderComponent headerComponent = new HeaderComponent();
        MoviePage moviePage = new MoviePage();
        CreateListPage createListPage = new CreateListPage();
        AddEditItemsPage addEditItemsPage = new AddEditItemsPage();
        EditListPage editListPage = new EditListPage();
        ListsPage listsPage = new ListsPage();
        DeletePage deletePage = new DeletePage();

        loginPage
                .themoviedbLogin();

        headerComponent
                .clickLogo();

        homePage
                .clickAcceptAllCookies()
                .clickFirstMovieItemTrending();

        moviePage
                .clickAddToListButton()
                .clickCreateNewList();

        createListPage
                .inputName(LIST_NAME)
                .inputDescription(LIST_DESCRIPTION)
                .clickContinueButton();

        addEditItemsPage
                .inputAddItem(MOVIE_NAME)
                .inputDescription(MOVIE_DESCRIPTION);

        editListPage
                .clickSaveButton();

        headerComponent
                .clickLogo()
                .clickAccountProfile()
                .clickListsButton();

        listsPage
                .clickListItem();

        assertTrue(listsPage.getListItem().isDisplayed());
        assertTrue(listsPage.getListItem().getText().contains(LIST_NAME));

        listsPage
                .clickEditButton();

        editListPage
                .clickDeleteList();

        deletePage
                .clickConfirmDelete()
                .clickYesButton();

        assertTrue(listsPage.getTitleYouHaventCreatedAnyLists().getText().contains(TITLE));

    }
}
