import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    @Test
    void hepsiburadaLoginTesti(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        driver.findElement(By.id("myAccount")).click();
    }
}
