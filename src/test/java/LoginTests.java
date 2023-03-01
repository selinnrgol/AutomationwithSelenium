import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.Duration;

public class LoginTests {
    WebDriver driver;

    @BeforeEach
    void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    void hepsiburadaLoginTesti () throws InterruptedException{

        driver.get("https://www.hepsiburada.com/");

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20L));//verilen thread.sleep olduğundan fazla ise 20L geçtikten sonra hata gönderir

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myAccount")));// bu elementin olup olmadığını kontrol eder.ona göre çalıştırır
        driver.findElement(By.id("myAccount")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
        driver.findElement(By.id("login")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUserName")));
        driver.findElement(By.id("txtUserName")).sendKeys("seleniumAutimation@gmail.com");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnLogin")));
        driver.findElement(By.id("btnLogin")).click();

    }
   /* @AfterEach
    void tearDown(){
        driver.close();
    }
    */
}
