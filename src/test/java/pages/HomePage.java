package pages;

import fragments.HeaderFragment;

public class HomePage extends HeaderFragment {

    public HomePage clickLogo() {
        getHeaderLogo().click();
        return this;
    }

    public HomePage clickLoginHeader() {
        getLoginHeader().click();
        return this;
    }
}
