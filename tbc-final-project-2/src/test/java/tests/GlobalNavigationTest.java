package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ge.tbc.testautomation.pages.GlobalNavigationPage;
import ge.tbc.testautomation.steps.GlobalNavigationSteps;

public class GlobalNavigationTest extends BaseTest {

    @Test
    public void verifyNavigationToConsumerLoan() {

        GlobalNavigationPage navPage = new GlobalNavigationPage(page);
        GlobalNavigationSteps steps = new GlobalNavigationSteps(navPage);

        steps.navigateToConsumerLoan();

        Assert.assertTrue(page.url().contains("consumer-loan"));
    }
}