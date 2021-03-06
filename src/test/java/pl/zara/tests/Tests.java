package pl.zara.tests;

import pl.zara.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class Tests extends TestBase {
    @Test
    @Description("Open the page and check if there is Cookies label")
    @DisplayName("Cookies label check")
    void cookiesTest() {

        step("Open url https://www.zara.com/pl/", () -> {
            open("https://www.zara.com/pl/");
        });
        step("Click the cookies button", () ->
                $("#onetrust-accept-btn-handler").click());
        step("check if there is label \"Akceptuj wszystkie pliki cookie\"", () -> {
            $("#onetrust-banner-sdk")
                    .shouldBe(visible);
        });
    }


    @Test
    @Description("Page console log errors test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.zara.com/pl/'", () ->
                open("https://www.zara.com/pl/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Description("Check dress in the cart")
    @DisplayName("Add a dress  to the cart and check if it saved there")
    void checkSandwichButton() {
        step("Open url 'https://www.zara.com/pl/'", () ->
                open("https://www.zara.com/pl/"));
        step("Click the cookies button", () ->
                $("#onetrust-accept-btn-handler").click());
        step("Click continue", () ->
                $(".geolocation-modal__button")
                        .click());
        step("Check the sandwich button", () ->
                $(".layout-header__mobile-action")
                        .shouldBe(visible));
    }

    @Test
    @Description("Add to the cart")
    @DisplayName("Add a dress  to the cart and check if it saved there")
    void addToCartTest() {
        step("Open url 'https://www.zara.com/pl/'", () ->
                open("https://www.zara.com/pl/"));
        step("Click the cookies button", () ->
                $("#onetrust-accept-btn-handler").click());
        step("Click continue", () ->
                $(".geolocation-modal__button").click());
        step("Click the sandwich button", () ->
                $(".layout-header__mobile-action").click());
        step("Choose Kobieta", () ->
                $("[aria-label=\"KOBIETA, Rozwi?? kategorie pomocnicze\"]").click());
        step("Choose dresses", () ->
                $("[aria-label=\"SUKIENKI, Rozwi?? kategorie pomocnicze\"]").click());
        step("Choose the first dress", () ->
                $(".product-link").click());
        step("Add to cart", () ->
                $(".product-cart-buttons").click());
        step("Verify an error message", () ->
                $(".modal__container")
                        .shouldHave(text("MUSISZ WYBRA?? ROZMIAR.")));
        step("Close the error message", () ->
                $(".modal__actions").click());
        step("Choose the first available size", () ->
                $(".product-detail-size-selector__size-list").click());
        step("Add to cart with chosen size", () ->
                $(".product-cart-buttons").click());
        step("Check if there is an item in the cart", () ->
                $(".mini-cart-item").shouldBe(visible));

    }

    @Test
    @Description("Search input test")
    @DisplayName("Check if there is a search input")
    void checkSearchInput() {
        step("Open url 'https://www.zara.com/pl/'", () ->
                open("https://www.zara.com/pl/"));
        step("Click the cookies button", () ->
                $("#onetrust-accept-btn-handler").click());
        step("Click continue", () ->
                $(".geolocation-modal__button").click());
        step("Check the search input field", () ->
                $(".layout-header-search-bar").shouldBe(visible));

    }

    @Test
    @Description("Displayed description test")
    @DisplayName("Open the dress page and check if there is displayed description")
    void checkDressDescription() {
        step("Open url 'https://www.zara.com/pl/'", () ->
                open("https://www.zara.com/pl/"));
        step("Click the cookies button", () ->
                $("#onetrust-accept-btn-handler").click());
        step("Click continue", () ->
                $(".geolocation-modal__button").click());
        step("Click the sandwich button", () ->
                $(".layout-header__mobile-action").click());
        step("Choose Kobieta", () ->
                $("[aria-label=\"KOBIETA, Rozwi?? kategorie pomocnicze\"]").click());
        step("Choose New collection", () ->
                $("[aria-label=\"NEW COLLECTION, Rozwi?? kategorie pomocnicze\"]")
                        .click());
        step("Choose dresses", () ->
                $("[aria-label=\"SUKIENKI , Rozwi?? kategorie pomocnicze\"]").click());
        step("Choose the first dress", () ->
                $(".product-link").click());
        step("Check the description", () ->
                $(".product-detail-description").shouldBe(visible));

    }
}