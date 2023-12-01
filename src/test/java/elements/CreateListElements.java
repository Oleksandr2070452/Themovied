package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class CreateListElements extends BasePage {

    private final static String NAME_INPUT = "//input[@id='name']";
    private final static String DESCRIPTION_TEXTAREA = "//textarea[@id='description']";
    private final static String PUBLIC_LIST_DROPDOWN = "//span[@id='de103aa8-dc3a-4972-a583-00e4fbd6b41f']";
    private final static String CONTINUE_BUTTON = "//input[@id='step_1_submit']";
    private final static String NO_PUBLIC_SELECTOR = "//li[@aria-selected='false' and text()='No']";

    protected SelenideElement getNameInput() {
        return getVisibleOfElement(NAME_INPUT);
    }

    protected SelenideElement getDescriptionTextArea() {
        return getVisibleOfElement(DESCRIPTION_TEXTAREA);
    }

    protected SelenideElement getPublicListDropdown() {
        return getVisibleOfElement(PUBLIC_LIST_DROPDOWN);
    }

    protected SelenideElement getContinueButton() {
        return getVisibleOfElement(CONTINUE_BUTTON);
    }

    protected SelenideElement getNoPublicSelector() {
        return getVisibleOfElement(NO_PUBLIC_SELECTOR);
    }
}
