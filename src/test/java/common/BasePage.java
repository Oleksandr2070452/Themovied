package common;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

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
        SelenideElement element = $(By.xpath(selector));
        actions().moveToElement(element).perform();
    }

    private SelenideElement findElementByTextFormat(String locator) {
        String dynamicXPath = String.format(locator);
        return $(dynamicXPath);
    }
}

