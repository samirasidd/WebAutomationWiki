package testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilites.DriverSetup;

public class TestLoginPage extends DriverSetup {


    private static final Logger log = LoggerFactory.getLogger(TestLoginPage.class);
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TestUserCanLoginWithValidCredentials(){
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_button);
        loginPage.writeOnElement(loginPage.username_input, loginPage.username);
        loginPage.writeOnElement(loginPage.password_input, loginPage.password);
        loginPage.clickOnElement(loginPage.login_button);
        Assert.assertEquals(mainPage.getElementText(mainPage.username), loginPage.username);
        Assert.assertTrue(mainPage.waitForElementToBeVisible(mainPage.user_icon).isDisplayed());
     //   Assert.assertFalse(mainPage.visibleState(mainPage.login_button));

    }

}
