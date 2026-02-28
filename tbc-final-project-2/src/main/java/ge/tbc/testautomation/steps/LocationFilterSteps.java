package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.LocationFilterPage;

public class LocationFilterSteps {

    private final LocationFilterPage page;

    public LocationFilterSteps(LocationFilterPage page) {
        this.page = page;
    }

    public void searchByArea(String area) {
        page.searchInput.fill(area);
        page.searchInput.press("Enter");
    }

    public int getResultCount() {
        return page.branchCards.count();
    }
}