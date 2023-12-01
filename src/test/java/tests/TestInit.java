package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class TestInit extends Assert {

    private static final String BASE_URL = "https://www.themoviedb.org/";

    @BeforeMethod
    public void setup() {

        Configuration.browser = "chrome";
        Configuration.headless = false;
        open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void closeTest() {
        Selenide.closeWindow();
    }

    public static boolean getUrl(String endpoint) {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains(endpoint);
    }
}

