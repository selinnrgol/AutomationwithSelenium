package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public final String myaccountHomePage= "myAccount";
    public final String loginHomePage= "login";

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
