package elements;

import com.codeborne.selenide.SelenideElement;
import common.BasePage;

public class AddEditItemsElements extends BasePage {

    private final static String ADD_ITEM_SEARCH_INPUT = "//input[@id='list_item_search']";
    private final static String MOVIE_DESCRIPTION_TEXTAREA = "//textarea[@class='k-textbox']";

    public SelenideElement getAddItemSearchInput() {
        return getVisibleOfElement(ADD_ITEM_SEARCH_INPUT);
    }

    public SelenideElement getMovieDescriptionTextarea() {
        return getVisibleOfElement(MOVIE_DESCRIPTION_TEXTAREA);
    }
}
