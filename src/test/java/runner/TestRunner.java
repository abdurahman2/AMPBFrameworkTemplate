package runner;

import desktop.pages.BookDepositoryLoginPage;
import driver.SingletonDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectPackages;
import org.openqa.selenium.WebDriver;

import static constants.Constants.*;


@SelectPackages("runner")

class TestRunner {

    static WebDriver driver = SingletonDriver.getWebDriverInstance();
    BookDepositoryLoginPage bookDepositoryLoginPage = new BookDepositoryLoginPage(driver);

    @Test
    void navigateToHomePage() {
        String url = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .getNavigationBar()
                .navigateToHomePage()
                .getCurrentUrl();
        Assertions.assertEquals(HOME_PAGE_URL, url, "Home page URL incorrect");
    }

    @Test
    void navigateToContactUsPage() {
        String url = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .getNavigationBar()
                .navigateToContactUsPage()
                .getCurrentUrl();
        Assertions.assertEquals(CONTACT_URL, url, "Contact us page URL incorrect");
    }

    @Test
    void navigateToHelpPage() {
        String url = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .getNavigationBar()
                .navigateToHelpPage()
                .getCurrentUrl();
        Assertions.assertEquals(HELP_PAGE_URL, url, "Help page URL incorrect");
    }

    @Test
    void navigateToOrderStatusPage() {
        String url = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .getNavigationBar()
                .navigateToOrderStatusPage()
                .getCurrentUrl();
        Assertions.assertEquals(ORDER_STATUS_PAGE_URL, url, "Order status page URL incorrect");
    }

    @Test
    void navigateToWishListPage() {
        String url = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .getNavigationBar()
                .navigateToWishListPage()
                .getCurrentUrl();
        Assertions.assertEquals(WISHLIST_PAGE_URL, url, "Wish list page URL incorrect");
    }

    @Test
    void navigateToSignInJoinPage() {
        String url = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .getNavigationBar()
                .navigateToSignInJoinPage()
                .getCurrentUrl();
        Assertions.assertEquals(LOGIN_PAGE_URL, url, "Sign in join page URL incorrect");
    }

    @Test
    void clearEmailButtonIsAppeared() {
        String style = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .switchToLogInFrame()
                .setEmail("3topora@gmail.com")
                .getStyleClearEmailButton();
        Assertions.assertEquals("display: block;", style, "Clear email button is not displayed");
    }

    @Test
    void clearPasswordButtonIsAppeared() {
        String style = bookDepositoryLoginPage
                .openBookDepositoryLoginPage()
                .switchToLogInFrame()
                .setPassword("777")
                .getStyleClearPasswordButton();
        Assertions.assertEquals("display: block;", style,"Clear password button is not displayed");
    }

    @AfterAll
    static void browserTearDown() {
        driver.quit();
    }
}
