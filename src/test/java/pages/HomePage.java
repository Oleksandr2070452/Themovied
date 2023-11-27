package pages;

import elements.HomeElements;

public class HomePage extends HomeElements {

    public HomePage inputSearchField(String text) {
        getSearchInput().sendKeys(text);
        return this;
    }

    public HomePage clickSearchButton() {
        getSearchButton().click();
        return this;
    }
}
