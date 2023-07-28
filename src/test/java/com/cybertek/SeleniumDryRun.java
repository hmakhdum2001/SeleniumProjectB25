package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        // 1.set up chrome driver
        WebDriverManager.chromedriver().setup();
        // :2. Create WebDriver instance that point to chrome dirver
        WebDriver driver = new ChromeDriver();
        // 3. Navigate to https://google.com
        driver.navigate().to("https://google.com");
        WebElement consent = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        consent.click();



    }
}
