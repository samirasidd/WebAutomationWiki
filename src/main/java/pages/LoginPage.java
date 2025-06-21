package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public String url = "https://auth.wikimedia.org/testwiki/wiki/Special:UserLogin?";

    public String error_text = "Incorrect username or password entered. Please try again.";

    public String username = "Sidd1122";

    public String password = "automation123";

    public String email = "";

    public By username_input = By.id("wpName1");


    public By password_input = By.xpath("//input[@id='wpPassword1']");

    public By keep_me_logged_in = By.xpath("//input[@id='wpRemember']");

    public By login_button = By.xpath("//button[@id='wpLoginAttempt']");

    public By error_message = By.xpath("//div[@class='cdx-message__content']");


}