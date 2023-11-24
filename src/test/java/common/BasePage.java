package common;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    protected SelenideElement getVisibleOfElement(String locator) {
        return $(By.xpath(locator)).shouldBe(visible, Duration.ofSeconds(15));
    }

    protected SelenideElement getClickableOfElement(String locator) {
        return $(By.xpath(locator)).shouldBe(enabled, Duration.ofSeconds(15));
    }

    protected ElementsCollection getListPresenceOfElements(String locator) {
        return $$(By.xpath(locator)).shouldBe(CollectionCondition
                .sizeGreaterThan(0), Duration.ofSeconds(15));
    }

    protected SelenideElement getPresenceOfElement(String locator) {
        return $(By.xpath(locator)).shouldBe(exist, Duration.ofSeconds(15));
    }

    protected static void moveToElement(String selector) {
        WebElement element = $(By.xpath(selector));
        actions().moveToElement(element).perform();
    }

    public static void chooseDate(String locator, String day) {
        Select dateElement = new Select($(By.xpath(locator + day)));
        dateElement.selectByVisibleText(day);
    }
}

