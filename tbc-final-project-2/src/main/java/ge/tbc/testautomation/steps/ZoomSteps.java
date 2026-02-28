package ge.tbc.testautomation.steps;


import com.microsoft.playwright.*;
import ge.tbc.testautomation.pages.ZoomPage;
import org.testng.Assert;

public class ZoomSteps {

    private final Page page;
    private final ZoomPage zoomPage;

    public ZoomSteps(Page page) {
        this.page = page;
        this.zoomPage = new ZoomPage(page);
    }

    public ZoomSteps rejectCookies() {
        zoomPage.rejectCookiesButton.click();
        return this;
    }

    public ZoomSteps goToLocations() {
        zoomPage.personalCategory.hover();
        zoomPage.locations.click();
        return this;
    }

    public ZoomSteps verifyMapIsVisible() {
        zoomPage.mapContainer.waitFor();
        Assert.assertTrue(zoomPage.mapContainer.isVisible());
        return this;
    }

    public ZoomSteps verifyPinsAreVisible() {
        Assert.assertTrue(zoomPage.pins.count() > 0);
        return this;
    }

    public ZoomSteps verifyZoomIn() {

        zoomPage.mapContainer.click();

        String initialScale = zoomPage.scaleButton.getAttribute("aria-label");
        System.out.println("Initial scale before zoom in: " + initialScale);

        page.keyboard().press("+");

        page.waitForTimeout(1000);

        String updatedScale = zoomPage.scaleButton.getAttribute("aria-label");
        System.out.println("Scale after zoom in: " + updatedScale);

        Assert.assertNotEquals(initialScale, updatedScale);

        return this;
    }

    public ZoomSteps verifyZoomOut() {

        zoomPage.mapContainer.click();

        String initialScale = zoomPage.scaleButton.getAttribute("aria-label");
        System.out.println("Initial scale before zoom out: " + initialScale);

        page.keyboard().press("-");

        page.waitForTimeout(1000);

        String updatedScale = zoomPage.scaleButton.getAttribute("aria-label");
        System.out.println("Scale after zoom out: " + updatedScale);

        Assert.assertNotEquals(initialScale, updatedScale);

        return this;
    }

    public ZoomSteps verifyPanning() {

        zoomPage.mapContainer.click();

        Locator firstMarker = zoomPage.pins.first();

        int initialX = (int) firstMarker.boundingBox().x;
        int initialY = (int) firstMarker.boundingBox().y;

        System.out.println("Initial position: x=" + initialX + ", y=" + initialY);

        page.keyboard().press("ArrowDown");
        page.keyboard().press("ArrowRight");

        page.waitForTimeout(1000);

        int newX = (int)firstMarker.boundingBox().x;
        int newY = (int)firstMarker.boundingBox().y;

        System.out.println("New position: x=" + newX + ", y=" + newY);

        Assert.assertTrue(initialX != newX || initialY != newY);

        return this;
    }
}