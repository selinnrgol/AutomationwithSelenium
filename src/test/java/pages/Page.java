package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    WebDriver driver;

    public Page(WebDriver driver){
        this.driver= driver;
    }

    public void waitElement(String elementId)
    {

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20L));//verilen thread.sleep olduğundan fazla ise 20L geçtikten sonra hata gönderir
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));// bu elementin olup olmadığını kontrol eder.ona göre çalıştırır
    }

    //tuşa bas metodu
    public void pushButton(String buttonId)
    {
        driver.findElement(By.id(buttonId)).click();
    }
    public void writeInTheArea(String elementId, String emailAdress){
        driver.findElement(By.id(elementId)).sendKeys(emailAdress);
    }
}
