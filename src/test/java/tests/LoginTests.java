package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import pages.LoginPage;


import java.time.Duration;

public class LoginTests {
    WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;


    @BeforeEach
    void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        homePage= new HomePage(driver);
        loginPage= new LoginPage(driver);

    }
    @Test
    void hepsiburadaLoginTesti () throws InterruptedException{

        driver.get("https://www.hepsiburada.com/");

       // WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20L));//verilen thread.sleep olduğundan fazla ise 20L geçtikten sonra hata gönderir

       // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myAccount")));// bu elementin olup olmadığını kontrol eder.ona göre çalıştırır

        homePage.waitElement(homePage.myaccountHomePage);//hesabım elementi gözükene kadar bekle
      //  driver.findElement(By.id("myAccount")).click();
        homePage.pushButton(homePage.myaccountHomePage);//hesabım tuşuna bas
        homePage.waitElement(homePage.loginHomePage);//giriş yap elementi bekle
        homePage.pushButton(homePage.loginHomePage);//giriş yap butonuna bas



        loginPage.waitElement(loginPage.emailAdressLoginPage);//giriş yap sayfasında emailadresinin elementi gözükmesini bekleyecek
        loginPage.writeInTheArea(loginPage.emailAdressLoginPage,"seleniumAutimation@gmail.com");// emaili yaz
        loginPage.waitElement(loginPage.loginButtonLoginPage);// giriş yap tuşu elementini göreceğiz
        loginPage.pushButton(loginPage.loginButtonLoginPage);//giriş yap tuşuna basılacak

    }
   /* @AfterEach
    void tearDown(){
        driver.close();
    }
    */
}
