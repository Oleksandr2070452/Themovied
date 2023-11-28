package pages;

import elements.MovieElements;

public class MoviePage extends MovieElements {

    public MoviePage clickAddToListButton() {
        getAddToListButton().click();
        return this;
    }

    public MoviePage clickCreateNewList() {
        getCreateNewListButton().click();
        return this;
    }
}
