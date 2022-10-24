package com.cucumber.junit.steps;

import desktop.pages.HomePage;
import driver.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static constants.Constants.HOME_PAGE_URL;

public class NavigationBarSteps {

    HomePage homePage = new HomePage();

    @When("the user opens BookDepositoryHomePage page")
    public void openBookDepositoryHomePage() {
        homePage.open(HOME_PAGE_URL);
    }

    @When("the user click on the {string} icon")
    public void clickOnIcon(String icon) {
        homePage.getNavigationBar().getIcon(icon).click();
    }

    @Then("the page with {string} url is displayed")
    public void verifyPageUrl(String pageUrl) {
        String actualPageUrl = DriverManager.getDriver().getCurrentUrl();
        switch (pageUrl) {
            case "Help":
                String helpUrl = HOME_PAGE_URL + pageUrl.toLowerCase();
                Assert.assertEquals("URL invalid or null", actualPageUrl, helpUrl);
                break;
            case "Order Status":
                String orderStatusUrl = HOME_PAGE_URL + "track";
                Assert.assertEquals("URL invalid or null", actualPageUrl, orderStatusUrl);
                break;
            case "Contact us":
                String contactUsUrl = HOME_PAGE_URL + pageUrl.toLowerCase().replace(" ", "");
                Assert.assertEquals("URL invalid or null", actualPageUrl, contactUsUrl);
                break;
            case "Wishlist":
                String wishListUrl = HOME_PAGE_URL + "account/login";
                Assert.assertEquals("URL invalid or null", actualPageUrl, wishListUrl);
                break;
            case "Sign in/Join":
                String signUrl = HOME_PAGE_URL + "account/login/to/account";
                Assert.assertEquals("URL invalid or null", actualPageUrl, signUrl);
                break;
        }
    }
}
