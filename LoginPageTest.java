package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldsAreEmpty() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertFalse(loginPage.isLoginButtonEnabled(), "Login button should be disabled if fields are empty");
    }

    @Test
    public void testPasswordMaskedButton() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isPasswordMasked(), "Password should be masked by default");
        loginPage.togglePasswordVisibility();
        Assert.assertFalse(loginPage.isPasswordMasked(), "Password should be visible after toggle");
    }

    @Test
    public void testInvalidLoginShowErrorMsg() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("wrong@example.com");
        loginPage.enterPassword("wrongpass");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getErrorMessage().length() > 0, "Error message should be displayed");
    }

    @Test
    public void testElementPresence() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isEmailFieldPresent(), "Email field should be visible");
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "Password field should be visible");
        Assert.assertTrue(loginPage.isToggleIconPresent(), "Password toggle icon should be visible");
    }
}