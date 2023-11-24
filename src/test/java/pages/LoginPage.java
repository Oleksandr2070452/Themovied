package pages;

import elements.LoginElements;
import utils.UserData;

public class LoginPage extends LoginElements {

    public LoginPage inputUserName() {
        getUserNameInput().sendKeys(UserData.USER_NAME);
        return this;
    }

    public LoginPage inputUserPassword() {
        getUserPasswordInput().sendKeys(UserData.USER_PASSWORD);
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
}
