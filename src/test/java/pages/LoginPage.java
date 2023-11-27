package pages;

import elements.LoginElements;
import fragments.HeaderComponent;
import helpers.Randomizers;

import static utils.UserData.USER_NAME;
import static utils.UserData.USER_PASSWORD;

public class LoginPage extends LoginElements {

    public LoginPage inputUserName(String name) {
        getUserNameInput().sendKeys(name);
        return this;
    }

    public LoginPage inputUserPassword(String password) {
        getUserPasswordInput().sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        getLoginButton().click();
        return this;
    }

    public LoginPage clickResetPassword() {
        getResetPassword().click();
        return this;
    }

    public LoginPage inputInvalidUserName() {
        Randomizers.randomName(getUserNameInput());
        return this;
    }

    public LoginPage inputInvalidUserPassword() {
        Randomizers.randomPassword(getUserPasswordInput());
        return this;
    }

    public boolean isErrorMessageThereWasAProblemVisible() {
        return getErrorMessageThereWasAProblem().isDisplayed();
    }

    public LoginPage themoviedbLogin() {
        HomePage homePage = new HomePage();
        HeaderComponent headerComponent = new HeaderComponent();

        headerComponent
                .clickLoginHeader();

        inputUserName(USER_NAME)
                .inputUserPassword(USER_PASSWORD)
                .clickLoginButton();
        return this;
    }
}
