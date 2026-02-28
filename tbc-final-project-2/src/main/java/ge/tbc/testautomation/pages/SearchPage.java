package ge.tbc.testautomation.pages;

import com.microsoft.playwright.*;

public class SearchPage {

    private final Page page;

    public final Locator searchIcon;
    public final Locator searchInput;
    public final Locator searchResults;

    public SearchPage(Page page) {
        this.page = page;
        this.searchIcon = page.locator("button[aria-label='Search']");
        this.searchInput = page.locator("input[type='search']");
        this.searchResults = page.locator(".search-result-item");
    }

}