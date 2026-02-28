package ge.tbc.testautomation.pages;

import com.microsoft.playwright.*;

public class OfferPage {

    private final Page page;

    public final Locator categoryFilter;
    public final Locator offerCards;

    public OfferPage(Page page) {
        this.page = page;
        this.categoryFilter = page.locator("text=Travel");
        this.offerCards = page.locator(".offer-card");
    }

}