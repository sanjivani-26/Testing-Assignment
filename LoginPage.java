package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[contains(text(),'Login')]");
    private By togglePassword = By.cssSelector(".input-group-append .btn");
    private By errorMsg = By.className("invalid-feedback");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isPasswordMasked() {
        WebElement pwdField = driver.findElement(passwordField);
        return pwdField.getAttribute("type").equals("password");
    }

    public void togglePasswordVisibility() {
        driver.findElement(togglePassword).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }

    public boolean isEmailFieldPresent() {
        return driver.findElement(emailField).isDisplayed();
    }

    public boolean isPasswordFieldPresent() {
        return driver.findElement(passwordField).isDisplayed();
    }

    public boolean isToggleIconPresent() {
        return driver.findElements(togglePassword).size() > 0;
    }
}