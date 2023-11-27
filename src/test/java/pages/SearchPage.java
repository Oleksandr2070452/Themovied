package pages;

import elements.SearchElements;

public class SearchPage extends SearchElements {

    public boolean isListOfMovieElementsByTextNameVisible(String text) {
        return getMovieList().texts().contains(text);
    }
}
