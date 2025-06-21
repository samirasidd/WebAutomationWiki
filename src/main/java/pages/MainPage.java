package pages;

import org.openqa.selenium.By;
import utilites.DriverSetup;

import java.security.PublicKey;

public class MainPage extends BasePage {

    public String url = "https://en.wikipedia.org/wiki/Main_Page";
    public String title = "Wikipedia, the free encyclopedia";
    public By main_logo = By.xpath("//span[@class='mw-logo-container skin-invert']");
    public By search_box = By.xpath("//input[@title='Search Wikipedia");
    public By search_button = By.xpath("//button[normalize-space()='Search']");
    public By hamburger_menu = By.xpath("//input[@id='vector-main-menu-dropdown-checkbox']");
    public By appearance = By.xpath("//input[@id='vector-appearance-dropdown-checkbox']");

    public By login = By.xpath("//a[@data-mw='interface']//span[contains(text(),'Log in')]");
    public By create_account = By.xpath("//a[@data-mw='interface']//span[contains(text(),'Create account')]");
    public By donate = By.xpath("//a[@data-mw='interface']//span[contains(text(),'Donate')]");


    //After login

    public By username = By.xpath("(//span[contains(text(),'Sidd1122')])[1]");
    public By user_icon = By.xpath("//input[@id='vector-user-links-dropdown-checkbox']");
    }
