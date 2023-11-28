package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class EditListElements extends BasePage {

    private static final String SAVE_BUTTON = "//input[@value='Save']";
    private final static String DELETE_LIST_BUTTON = "//a[text()='Delete List']";

    public SelenideElement getDeleteListButton() {
        return getVisibleOfElement(DELETE_LIST_BUTTON);
    }

    public SelenideElement getSaveButton() {
        return getVisibleOfElement(SAVE_BUTTON);
    }
}
