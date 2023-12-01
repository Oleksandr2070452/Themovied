package tests;

import elements.LoginElements;
import fragments.HeaderComponent;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.EditProfilePage;
import pages.HomePage;
import pages.LoginPage;

import static utils.UserData.USER_NAME;
import static utils.UserData.USER_PASSWORD;

public class LoginTest extends TestInit {

    @Test
    @Description("Positive: user login with valid credentials")
    public void userValidLogin() {


        LoginPage loginPage = new LoginPage();
        LoginElements loginElements = new LoginElements();
        HeaderComponent headerComponent = new HeaderComponent();

        headerComponent
                .clickLoginHeader();

        loginPage
                .inputUserName(USER_NAME)
                .inputUserPassword(USER_PASSWORD)
                .clickLoginButton();

        assertTrue(getUrl("Oleksandr"));
        assertTrue(loginElements.getUserNameTitle("Oleksandr"));

    }

    @Test
    @Description("Negative: user login with invalid credentials")
    public void userInvalidLogin() {

        LoginPage loginPage = new LoginPage();
        HeaderComponent headerComponent = new HeaderComponent();

        headerComponent
                .clickLoginHeader();

        loginPage
                .inputInvalidUserName()
                .inputInvalidUserPassword()
                .clickLoginButton();

        assertTrue(loginPage.isErrorMessageThereWasAProblemVisible());

    }

    @Test
    @Description("Positive: user edit his account ")
    public void userEditHisProfile() {

        HomePage homePage = new HomePage();
        HeaderComponent headerComponent = new HeaderComponent();
        LoginPage loginPage = new LoginPage();
        EditProfilePage editProfilePage = new EditProfilePage();
        homePage
                .clickAcceptAllCookies();

        loginPage
                .themoviedbLogin();

        headerComponent
                .clickAccountProfile()
                .clickEditProfileButton();

        editProfilePage
                .selectMaleGender()
                .inputName("Oleksandr")
                .clickSaveButton();

        assertTrue(editProfilePage.getNameAccountHeader().getText().contains("Oleksandr"));

    }

    @Test
    @Description("Positive: user reset his password")
    public void userResetPassword() {

        HomePage homePage = new HomePage();
        HeaderComponent headerComponent = new HeaderComponent();
        LoginPage loginPage = new LoginPage();
        EditProfilePage editProfilePage = new EditProfilePage();
        homePage
                .clickAcceptAllCookies();

        loginPage
                .themoviedbLogin();

        headerComponent
                .clickAccountProfile()
                .clickEditProfileButton();

        editProfilePage
                .clickResetPasswordButton()
                .clickYesButton();

        assertTrue(homePage.getLoggedOutHeader().getText().contains("Logged Out!"));

    }
}
