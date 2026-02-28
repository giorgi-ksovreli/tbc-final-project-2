package tests;


import ge.tbc.testautomation.api.ApiClient;
import org.testng.Assert;
import org.testng.annotations.Test;
import ge.tbc.testautomation.pages.OfferPage;
import ge.tbc.testautomation.pojo.PageResponse;

public class ApiUiConsistencyTest extends BaseTest {

    @Test
    public void validateApiUiConsistency() {

        PageResponse response = ApiClient.getPage("consumer-loan");

        OfferPage pageObj = new OfferPage(page);

        Assert.assertEquals(pageObj.getTitle(), response.getTitle());
    }
}