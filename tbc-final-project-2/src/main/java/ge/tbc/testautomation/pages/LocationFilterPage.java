package ge.tbc.testautomation.pages;

import com.microsoft.playwright.*;

public class LocationFilterPage {

    private final Page page;

    public final Locator searchInput;
    public final Locator branchCards;

    public LocationFilterPage(Page page) {
        this.page = page;
        this.searchInput = page.locator("input[type='search']");
        this.branchCards = page.locator(".atm-branch-card");
    }

}