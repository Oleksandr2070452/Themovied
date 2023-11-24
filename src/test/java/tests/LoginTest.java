package tests;

import elements.LoginElements;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestInit {

    @Test
    @Description("Positive: user login with valid credentials")
    public void userLogin() {

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
}
