package tests;

import elements.LoginElements;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestInit {

    @Test
    @Description("Positive: user login with valid credentials")
    public void userValidLogin() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        LoginElements loginElements = new LoginElements();

        homePage
                .clickLoginHeader();

        loginPage
                .inputUserName()
                .inputUserPassword()
                .clickLoginButton();

        assertTrue(getUrl("sanek2070452"));
        assertTrue(loginElements.getUserNameTitle("sanek2070452"));

    }

    @Test
    @Description("Negative: user login with invalid credentials")
    public void userInvalidLogin() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage
                .clickLoginHeader();

        loginPage
                .inputInvalidUserName()
                .inputInvalidUserPassword()
                .clickLoginButton();

        assertTrue(loginPage.isErrorMessageThereWasAProblemVisible());
    }
}
