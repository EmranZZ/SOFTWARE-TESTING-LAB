package Selenium.Example_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

//Automate Login to a Sample Website
//We'll use: https://www.saucedemo.com; user-id(s) and password were given

public class SeleniumTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMMAD EMRAN\\Downloads\\chrome-driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver d = new ChromeDriver();

        d.get("https://www.saucedemo.com");

        d.findElement(By.id("user-name")).sendKeys("standard_user");
        d.findElement(By.id("password")).sendKeys("secret_sauce");
        d.findElement(By.id("login-button")).click();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        d.quit();

    }
}
