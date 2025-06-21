package testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilites.DataSet;
import utilites.DriverSetup;

public class TestLoginPage extends DriverSetup {


    private static final Logger log = LoggerFactory.getLogger(TestLoginPage.class);
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TestUserCanLoginWithValidCredentials() {
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_button);
        loginPage.writeOnElement(loginPage.username_input, loginPage.username);
        loginPage.writeOnElement(loginPage.password_input, loginPage.password);
        loginPage.clickOnElement(loginPage.login_button);
        Assert.assertEquals(mainPage.getElementText(mainPage.username), loginPage.username);
        Assert.assertTrue(mainPage.waitForElementToBeVisible(mainPage.user_icon).isDisplayed());
    }

    @Test
    public void TestUserShouldNotLoginWithInvalidPassword() {
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_button);
        loginPage.writeOnElement(loginPage.username_input, loginPage.username);
        loginPage.writeOnElement(loginPage.password_input, "password");
        loginPage.clickOnElement(loginPage.login_button);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), loginPage.error_text);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_button));
    }

    @Test
    public void TestUserShouldNotLoginWithInvalidUsername() {
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_button);
        loginPage.writeOnElement(loginPage.username_input, "username");
        loginPage.writeOnElement(loginPage.password_input, loginPage.password);
        loginPage.clickOnElement(loginPage.login_button);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), loginPage.error_text);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_button));
    }

    @Test
    public void TestUserShouldNotLoginWithInvalidCredentials() {
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_button);
        loginPage.writeOnElement(loginPage.username_input, "username");
        loginPage.writeOnElement(loginPage.password_input, "password");
        loginPage.clickOnElement(loginPage.login_button);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), loginPage.error_text);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_button));
    }

    @Test(dataProvider = "InvalidCredentials", dataProviderClass = DataSet.class)
    public void TestUserShouldNotLoginWithInvalidUserCredentials(String username, String password, String error_message) {
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_button);
        loginPage.writeOnElement(loginPage.username_input, username);
        loginPage.writeOnElement(loginPage.password_input, password);
        loginPage.clickOnElement(loginPage.login_button);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), error_message);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_button));
    }

}
