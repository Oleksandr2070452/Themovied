package tests;

import elements.LoginElements;
import fragments.HeaderComponent;
import jdk.jfr.Description;
import org.testng.annotations.Test;
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

        assertTrue(getUrl("sanek2070452"));
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
}
