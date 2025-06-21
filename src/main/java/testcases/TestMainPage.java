package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilites.DriverSetup;

public class TestMainPage extends DriverSetup {


    MainPage mainPage = new MainPage();

    @Test
    public void TestMainPageTitle() {
        mainPage.loadAPage(mainPage.url);
        Assert.assertEquals(mainPage.getPageTitle(), mainPage.title);
    }

    @Test
    public void TestLoginButton() {
        mainPage.loadAPage(mainPage.url);
        Assert.assertEquals(mainPage.getElementText(mainPage.login_button), "Log in");
        Assert.assertTrue(mainPage.getElement(mainPage.login_button).isEnabled());
    }

}
