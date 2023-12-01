package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class LoginElements extends BasePage {

    private final static String USERNAME_INPUT = "//input[@id='username']";
    private final static String USER_PASSWORD_INPUT = "//input[@id='password']";
    private final static String LOGIN_BUTTON = "//input[@id='login_button']";
    private final static String RESET_PASSWORD = "//input[@id='login_button']";
    private final static String USER_NAME_TITLE = "//div[@class='content_wrapper flex']//a[text()='%s']";
    private final static String ERROR_MESSAGE_THERE_WAS_A_PROBLEM = "//h2[@class='background_color red']";


    protected SelenideElement getUserNameInput() {
        return getVisibleOfElement(USERNAME_INPUT);
    }

    protected SelenideElement getUserPasswordInput() {
        return getVisibleOfElement(USER_PASSWORD_INPUT);
    }

    protected SelenideElement getLoginButton() {
        return getClickableOfElement(LOGIN_BUTTON);
    }

    protected SelenideElement getResetPassword() {
        return getClickableOfElement(RESET_PASSWORD);
    }

    public boolean getUserNameTitle(String username) {
        return getVisibleOfElement(String.format(USER_NAME_TITLE, username)).getText().contains(username);
    }

    public SelenideElement getErrorMessageThereWasAProblem() {
        return getVisibleOfElement(ERROR_MESSAGE_THERE_WAS_A_PROBLEM);
    }

}
