package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.SearchPage;

public class SearchSteps {

    private final SearchPage page;

    public SearchSteps(SearchPage page) {
        this.page = page;
    }

    public void search(String keyword) {
        page.searchIcon.click();
        page.searchInput.fill(keyword);
        page.searchInput.press("Enter");
    }

    public int getResultsCount() {
        return page.searchResults.count();
    }
}