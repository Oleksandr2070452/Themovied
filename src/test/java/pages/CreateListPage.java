package pages;

import elements.CreateListElements;

public class CreateListPage extends CreateListElements {

    public CreateListPage inputName(String name) {
        getNameInput().sendKeys(name);
        return this;
    }

    public CreateListPage inputDescription(String description) {
        getDescriptionTextArea().sendKeys(description);
        return this;
    }

    public CreateListPage selectNoPublic() {
        getPublicListDropdown().click();
        getNoPublicSelector().click();
        return this;
    }

    public CreateListPage clickContinueButton() {
        getContinueButton().click();
        return this;
    }

}
