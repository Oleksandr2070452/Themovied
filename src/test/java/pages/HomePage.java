package pages;

import fragments.HeaderComponent;

public class HomePage extends HeaderComponent {

    public HomePage clickLogo() {
        getHeaderLogo().click();
        return this;
    }

    public HomePage clickLoginHeader() {
        getLoginHeader().click();
        return this;
    }
}
