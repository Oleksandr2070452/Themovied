package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class DeleteElements extends BasePage {

    private static final String CONFIRM_DELETE_BUTTON = "//button[@id='delete_list']";
    private static final String YES_BUTTON = "//button[text()='Yes']";

    public SelenideElement getConfirmDeleteButton() {
        return getVisibleOfElement(CONFIRM_DELETE_BUTTON);
    }

    public SelenideElement getYesButton() {
        return getVisibleOfElement(YES_BUTTON);
    }
}
