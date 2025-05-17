package Selenium.Example_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SeleniumTest {
    public static void main(String[] args) {
        //Here we will type input to the search bar

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMMAD EMRAN\\Downloads\\chrome-driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver d = new ChromeDriver(); // WebDriver: Controls the browser

        d.get("https://www.google.com"); //URL you're trying to connect

        //findElement(By...): Locates elements on page
        d.findElement(By.name("q")).sendKeys("JUnit"); //.sendKeys(): Types into input field
        d.findElement(By.name("q")).submit(); //.click() / .submit(): Click or submit

        System.out.println("Title is: "+d.getTitle());
        d.quit();

    }
}
