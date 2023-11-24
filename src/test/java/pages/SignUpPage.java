package pages;

import elements.SignUpElements;
import helpers.Randomizers;
import utils.UserData;

public class SignUpPage extends SignUpElements {

    public SignUpPage inputSignUpUserName() {
        Randomizers.randomName(getSignUpNameInput());
        return this;
    }

    public SignUpPage inputSignUpUserPassword() {
        getSignUpPasswordInput().sendKeys(UserData.SIGN_UP_TEST_USER_PASSWORD);
        return this;
    }

    public SignUpPage inputSignUpConfirm() {
        getSignUpConfirmPasswordInput().sendKeys(UserData.SIGN_UP_TEST_USER_PASSWORD);
        return this;
    }

    public SignUpPage inputSignUpEmail() {
        Randomizers.randomEmail(getSignUpEmailInput());
        return this;
    }

    public SignUpPage clickSignUpButton() {
        getSignUpButton().click();
        return this;
    }

    public SignUpPage clickSignUpCancelButton() {
        getSignUpCancelButton().click();
        return this;
    }
}
