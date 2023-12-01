package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class EditProfileElements extends BasePage {

    private final static String GENDER_DROPDOWN = "//label[@id='gender_label']";
    private final static String GENDER_MALE = "//li[text()='Male']";
    private final static String NAME_INPUT = "//input[@id='name']";
    private final static String SAVE_BUTTON = "//input[@value='Save']";
    private final static String NAME_ACCOUNT_HEADER = "//div[@class='content_wrapper']//a[text()='Oleksandr']";
    private final static String RESET_PASSWORD_BUTTON = "//button[@class='k-button purple reset_password valid']";
    private final static String YES_BUTTON = "//button[text()='Yes']";

    protected SelenideElement getGenderDropdown() {
        return getVisibleOfElement(GENDER_DROPDOWN);
    }

    protected SelenideElement getGenderMale() {
        return getVisibleOfElement(GENDER_MALE);
    }

    protected SelenideElement getNameInput() {
        return getVisibleOfElement(NAME_INPUT);
    }

    protected SelenideElement getSaveButton() {
        return getVisibleOfElement(SAVE_BUTTON);
    }

    public SelenideElement getNameAccountHeader() {
        return getVisibleOfElement(NAME_ACCOUNT_HEADER);
    }

    public SelenideElement getResetPasswordButton() {
        return getVisibleOfElement(RESET_PASSWORD_BUTTON);
    }

    public SelenideElement getYesButton() {
        return getVisibleOfElement(YES_BUTTON);
    }
}
