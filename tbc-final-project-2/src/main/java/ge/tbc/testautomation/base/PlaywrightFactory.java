package ge.tbc.testautomation.base;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    public static BrowserContext createContext(String browserName, boolean mobile) {

        Playwright playwright = Playwright.create();
        Browser browser;

        switch (browserName.toLowerCase()) {
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "webkit":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            default:
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }

        if (mobile) {
            return browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(390, 844)
                    .setUserAgent("Mozilla/5.0 iPhone"));
        }

        return browser.newContext();
    }
}