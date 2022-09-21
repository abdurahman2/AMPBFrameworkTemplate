package desktop.pages;

import abstractclasses.page.AbstractPage;
import constants.Constants;
import desktop.fragments.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookDepositoryLoginPage extends AbstractPage {

    public BookDepositoryLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@placeholder='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@placeholder='Book Depository password']")
    private WebElement passwordField;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@style='display: block;']")
    private static WebElement clearEmailButton;

    @FindBy(xpath = "//*[@id=ap_password_icon]")
    private static WebElement clearPasswordButton;

    @FindBy(xpath = "//*[@class='signin-iframe']")
    private WebElement sigInFrame;

    public NavigationBar getNavigationBar() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(NavigationBar.getNavigationBarElement()));
        return new NavigationBar(driver);
    }

    public BookDepositoryLoginPage openBookDepositoryLoginPage() {
        open(Constants.LOGIN_PAGE_URL);
        return new BookDepositoryLoginPage(driver);
    }

    public BookDepositoryLoginPage switchToLogInFrame() {
        return new BookDepositoryLoginPage(driver.switchTo().frame(sigInFrame));
    }

    public BookDepositoryLoginPage setEmail(String str) {
        typeText(emailField, str);
        return this;
    }

    public BookDepositoryLoginPage setPassword(String str) {
        typeText(passwordField, str);
        return this;
    }

    public String getStyleClearEmailButton() {
        return clearEmailButton.getAttribute("style");
    }

    public String getStyleClearPasswordButton() {
        return clearPasswordButton.getAttribute("style");
    }
}
