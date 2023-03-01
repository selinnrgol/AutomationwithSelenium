package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    public final String emailAdressLoginPage= "txtUserName";
    public final String loginButtonLoginPage="btnLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
