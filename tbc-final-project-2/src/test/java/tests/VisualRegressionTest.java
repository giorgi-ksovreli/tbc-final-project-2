package tests;

import com.microsoft.playwright.Page;
import org.testng.annotations.Test;
import java.nio.file.Paths;

public class VisualRegressionTest extends BaseTest {

    @Test
    public void visualTest() {

        page.navigate("https://tbcbank.ge/ka/loans/consumer-loan");
        page.waitForLoadState();

        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("visual-baseline.png")));
    }
}