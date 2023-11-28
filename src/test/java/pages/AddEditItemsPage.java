package pages;

import elements.AddEditItemsElements;

public class AddEditItemsPage extends AddEditItemsElements {

    public AddEditItemsPage inputAddItem(String movieName) {
        getAddItemSearchInput().sendKeys(movieName);
        getAddItemSearchInput().pressEnter();
        return this;
    }

    public AddEditItemsPage inputDescription(String movieDescription) {
        getMovieDescriptionTextarea().sendKeys(movieDescription);
        return this;
    }
}
