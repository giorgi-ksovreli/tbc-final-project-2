package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ge.tbc.testautomation.pages.OfferPage;
import ge.tbc.testautomation.steps.OfferSteps;

public class OfferTest extends BaseTest {

    @Test
    public void verifyOfferFilter() {

        OfferPage pageObj = new OfferPage(page);
        OfferSteps steps = new OfferSteps(pageObj);

        steps.filterByTravel();

        Assert.assertTrue(steps.getOfferCount() > 0);
    }
}