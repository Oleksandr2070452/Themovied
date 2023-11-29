package pages;

import elements.WatchlistElements;

public class WatchlistPage extends WatchlistElements {

    public WatchlistPage clickTVButton() {
        getTVButton().click();
        return this;
    }

    public WatchlistPage clickRemoveButton() {
        getRemoveButton().click();
        return this;
    }
}
