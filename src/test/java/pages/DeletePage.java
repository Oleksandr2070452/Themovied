package pages;

import elements.DeleteElements;

public class DeletePage extends DeleteElements {

    public DeletePage clickConfirmDelete() {
        getConfirmDeleteButton().click();
        return this;
    }

    public DeletePage clickYesButton() {
        getYesButton().click();
        return this;
    }
}
