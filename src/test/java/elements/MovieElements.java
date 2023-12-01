package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class MovieElements extends BasePage {

    private final static String ADD_TO_LIST_BUTTON = "//li[@class='tooltip use_tooltip list tooltip_hover']";
    private final static String CREATE_NEW_LIST_BUTTON = "//span[@class='glyphicons_v2 plus invert svg']";
    private final static String WARNING_LOGIN_MESSAGE = "//div[text()='Login to create and edit custom lists']";
    private final static String ADD_TO_WISHLIST_BUTTON = "//a[@id='watchlist']";

    protected SelenideElement getAddToListButton() {
        return getVisibleOfElement(ADD_TO_LIST_BUTTON);
    }

    protected SelenideElement getCreateNewListButton() {
        return getVisibleOfElement(CREATE_NEW_LIST_BUTTON);
    }

    public SelenideElement getWarningLoginMessage() {
        return getVisibleOfElement(WARNING_LOGIN_MESSAGE);
    }

    protected SelenideElement getAddToWishlistButton() {
        return getVisibleOfElement(ADD_TO_WISHLIST_BUTTON);
    }
}
