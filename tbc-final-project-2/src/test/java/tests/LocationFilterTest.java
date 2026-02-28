package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ge.tbc.testautomation.pages.LocationFilterPage;
import ge.tbc.testautomation.steps.LocationFilterSteps;

public class LocationFilterTest extends BaseTest {

    @Test
    public void verifyLocationFilter() {

        LocationFilterPage pageObj = new LocationFilterPage(page);
        LocationFilterSteps steps = new LocationFilterSteps(pageObj);

        steps.searchByArea("Tbilisi");

        Assert.assertTrue(steps.getResultCount() > 0);
    }
}