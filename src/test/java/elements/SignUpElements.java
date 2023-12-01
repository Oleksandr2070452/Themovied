package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class SignUpElements extends BasePage {

    private final static String SIGN_UP_USER_NAME_INPUT = "//input[@id='username']";
    private final static String SIGN_UP_PASSWORD_INPUT = "//input[@id='username']";
    private final static String SIGN_UP_USER_CONFIRM_PASSWORD_INPUT = "//input[@id='username']";
    private final static String SIGN_UP_EMAIL_INPUT = "//input[@id='username']";
    private final static String SIGN_UP_BUTTON = "//input[@id='sign_up_button']";
    private final static String SIGN_UP_CANCEL_BUTTON = "//a[text()='Cancel']";


    protected SelenideElement getSignUpNameInput() {
        return getVisibleOfElement(SIGN_UP_USER_NAME_INPUT);
    }

    protected SelenideElement getSignUpPasswordInput() {
        return getVisibleOfElement(SIGN_UP_PASSWORD_INPUT);
    }

    protected SelenideElement getSignUpConfirmPasswordInput() {
        return getVisibleOfElement(SIGN_UP_USER_CONFIRM_PASSWORD_INPUT);
    }

    protected SelenideElement getSignUpEmailInput() {
        return getVisibleOfElement(SIGN_UP_EMAIL_INPUT);
    }

    protected SelenideElement getSignUpButton() {
        return getClickableOfElement(SIGN_UP_BUTTON);
    }

    protected SelenideElement getSignUpCancelButton() {
        return getClickableOfElement(SIGN_UP_CANCEL_BUTTON);
    }
}
