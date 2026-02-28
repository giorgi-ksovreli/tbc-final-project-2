package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.GlobalNavigationPage;

public class GlobalNavigationSteps {

    private final GlobalNavigationPage page;

    public GlobalNavigationSteps(GlobalNavigationPage page) {
        this.page = page;
    }

    public void navigateToConsumerLoan() {;
        page.loansMenu.hover();
        page.consumerLoanLink.click();
    }
}