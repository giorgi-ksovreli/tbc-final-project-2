package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.OfferPage;

public class OfferSteps {

    private final OfferPage page;

    public OfferSteps(OfferPage page) {
        this.page = page;
    }

    public void filterByTravel() {
        page.categoryFilter.click();
    }

    public int getOfferCount() {
        return page.offerCards.count();
    }
}