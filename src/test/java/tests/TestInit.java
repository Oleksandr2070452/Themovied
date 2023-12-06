package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import listeners.TestListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.ByteArrayInputStream;

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
    public void closeTest(ITestResult result) {
        if (result.getStatus() == ITestResult.SKIP || result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot screenshotDriver = (TakesScreenshot) WebDriverRunner.getWebDriver();
            byte[] screenshot = screenshotDriver.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Test" + result.getMethod().getMethodName(), "image/png",
                    new ByteArrayInputStream(screenshot), "png");
        }
        closeWindow();
    }

    public static boolean getUrl(String endpoint) {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains(endpoint);
    }

    public static void refreshPage() {
        Selenide.refresh();
    }
}

