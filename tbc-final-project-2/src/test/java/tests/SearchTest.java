package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ge.tbc.testautomation.pages.SearchPage;
import ge.tbc.testautomation.steps.SearchSteps;

public class SearchTest extends BaseTest {

    @Test
    public void verifySearchFunctionality() {

        SearchPage pageObj = new SearchPage(page);
        SearchSteps steps = new SearchSteps(pageObj);

        steps.search("loan");

        Assert.assertTrue(steps.getResultsCount() > 0);
    }
}