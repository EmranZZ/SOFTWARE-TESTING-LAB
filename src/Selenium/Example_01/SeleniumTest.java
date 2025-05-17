package Selenium.Example_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args){

        // 1. Set the path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMMAD EMRAN\\Downloads\\chrome-driver\\chromedriver-win64\\chromedriver.exe");

        // 2. Create WebDriver instance
        WebDriver driv = new ChromeDriver();

        // 3. Open Google
        driv.get("https://www.chatgpt.com");

        // 4. Print the title
        System.out.println("Page title is: " + driv.getTitle() + " " + driv.getCurrentUrl());

        // 5. Close the Browser
        driv.quit();
    }
}
