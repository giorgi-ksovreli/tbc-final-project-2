package tests;


import com.microsoft.playwright.*;
import ge.tbc.testautomation.base.PlaywrightFactory;
import org.testng.annotations.*;

public class BaseTest {

    public BrowserContext context;
    public Page page;

    @Parameters({"browser", "mobile"})
    @BeforeMethod
    public void setup(@Optional("chromium") String browser,
                      @Optional("false") String mobileFlag) {

        boolean mobile = Boolean.parseBoolean(mobileFlag);
        context = PlaywrightFactory.createContext(browser, mobile);
        page = context.newPage();
    }

    @AfterMethod
    public void tearDown() {
        context.close();
    }
}