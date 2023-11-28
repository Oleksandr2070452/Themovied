package pages;

import elements.ListsElements;

public class ListsPage extends ListsElements {


    public ListsPage clickListItem() {
        getListItem().click();
        return this;
    }

    public ListsPage clickEditButton() {
        getEditButton().click();
        return this;
    }
}
