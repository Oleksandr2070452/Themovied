package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class ListsElements extends BasePage {

    private final static String LIST_ITEM = "//a[text()='Test']";
    private final static String EDIT_BUTTON = "//a[text()='Edit']";
    private final static String YOU_HAVENT_CREATED_ANY_LISTS_TITLE = "//div[@class='items_wrapper']/p";

    public SelenideElement getListItem() {
        return getVisibleOfElement(LIST_ITEM);
    }

    public SelenideElement getEditButton() {
        return getVisibleOfElement(EDIT_BUTTON);
    }

    public SelenideElement getTitleYouHaventCreatedAnyLists() {
        return getPresenceOfElement(YOU_HAVENT_CREATED_ANY_LISTS_TITLE);
    }

}
