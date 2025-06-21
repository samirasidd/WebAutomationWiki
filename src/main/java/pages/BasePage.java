package pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utilites.DriverSetup.getDriver;

public class BasePage {

    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public boolean visibleState(By locator) {
        return getElement(locator).isDisplayed();
    }

    public void loadAPage(String url) {
        getDriver().get(url);
    }

    public String getPageTitle() {
        return getDriver().getTitle();
    }

    public String getElementText(By locator) {
        return getElement(locator).getText();

    }

    public WebElement waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
