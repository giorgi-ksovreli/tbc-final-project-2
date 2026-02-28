package ge.tbc.testautomation.pages;



import com.microsoft.playwright.*;

public class ZoomPage extends HomePage {
    private final Page page;

    public final Locator mapContainer;
    public final Locator pins;
    public final Locator scaleButton;

    public ZoomPage(Page page) {
        super(page);
        this.page = page;

        mapContainer = page.locator(".map-container");   // adjust if needed
        pins = page.locator(".leaflet-marker-icon");     // adjust if needed
        scaleButton = page.locator(".leaflet-control-scale-line");
    }
}