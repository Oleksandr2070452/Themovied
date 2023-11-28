package pages;

import elements.EditListElements;

public class EditListPage extends EditListElements {

    public EditListPage clickSaveButton() {
        getSaveButton().click();
        return this;
    }

    public EditListPage clickDeleteList() {
        getDeleteListButton().click();
        return this;
    }
}
