package pages;

import elements.EditProfileElements;

public class EditProfilePage extends EditProfileElements {

    public EditProfilePage selectMaleGender() {
        getGenderDropdown().click();
        getGenderMale().click();
        return this;
    }

    public EditProfilePage inputName(String name) {
        getNameInput().sendKeys(name);
        return this;
    }

    public EditProfilePage clickSaveButton() {
        getSaveButton().click();
        return this;
    }

    public EditProfilePage clickResetPasswordButton() {
        getResetPasswordButton().click();
        return this;
    }

    public EditProfilePage clickYesButton() {
        getYesButton().click();
        return this;
    }
}
