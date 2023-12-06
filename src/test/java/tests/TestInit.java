package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWindow;

@Listeners(TestListener.class)
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
        closeWindow();
    }

    public static boolean getUrl(String endpoint) {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains(endpoint);
    }
}

