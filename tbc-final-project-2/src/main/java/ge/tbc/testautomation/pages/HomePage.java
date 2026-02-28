package ge.tbc.testautomation.pages;

import com.microsoft.playwright.*;

public class HomePage {

    private final Page page;

    public final Locator rejectCookiesButton;
    public final Locator personalCategory;
    public final Locator locations;
    public final Locator tbcNav;
    public final Locator newsCategory;
    public final Locator breadcrumb;
    public final Locator pageHeader;
    public final Locator searchIcon;
    public final Locator searchInput;
    public final Locator searchResultsList;
    public final Locator searchResultTitles;
    public final Locator searchEmptyState;
    public final Locator searchEmptyTitle;
    public final Locator searchEmptyDescription;
    public final Locator offersMenuItem;

    public HomePage(Page page) {
        this.page = page;

        rejectCookiesButton = page.locator("//button[normalize-space(text())='უარყოფა']");
        personalCategory = page.locator("//div[contains(@class, 'tbcx-pw-navigation-item')]");
        locations = page.locator("//span[contains(@class,'tbcx-pw-mega-menu-quick-acitons-item__title') and normalize-space(text())='მისამართები']");
        tbcNav = page.locator("button.tbcx-pw-navigation-item__link");
        newsCategory = page.locator("//span[@class='tbcx-pw-mega-menu-sub-item__title' and text()='სიახლეები']");
        breadcrumb = page.locator("ul.tbcx-pw-breadcrumbs__items li.tbcx-pw-breadcrumbs__item a");
        pageHeader = page.locator("h2.marketing__header__title");
        searchIcon = page.locator("tbcx-icon[style*='search-outlined']");
        searchInput = page.locator("#tbcx-text-input-1");
        searchResultsList = page.locator(".search-result-item");
        searchResultTitles = page.locator(".search-result-item__title");
        searchEmptyState = page.locator(".global-search__bottom-content__container__not-fount-result");
        searchEmptyTitle = page.locator(".global-search__bottom-content__container__not-fount-result__title");
        searchEmptyDescription = page.locator(".global-search__bottom-content__container__not-fount-result__description");
        offersMenuItem = page.locator("//span[contains(@class,'mega-menu-quick-acitons-item__title') and normalize-space(text())='შეთავაზებები']");
    }

    public void open() {
        page.navigate("https://tbcbank.ge");
    }
}