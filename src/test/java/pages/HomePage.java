package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public final String myaccountHomePage= "myAccount";
    public final String loginHomePage= "login";
    public final String urunArama=" [placeholder='Ürün, kategori veya marka ara']";

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
