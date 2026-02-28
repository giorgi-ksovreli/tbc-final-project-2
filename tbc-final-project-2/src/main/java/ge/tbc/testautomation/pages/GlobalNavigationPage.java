package ge.tbc.testautomation.pages;

import com.microsoft.playwright.*;

public class GlobalNavigationPage {

    private final Page page;

    public final Locator loansMenu;
    public final Locator consumerLoanLink;

    public GlobalNavigationPage(Page page) {
        this.page = page;
        this.loansMenu = page.locator("text=სესხები");
        this.consumerLoanLink = page.locator("text=სამომხმარებლო სესხი");
    }

}