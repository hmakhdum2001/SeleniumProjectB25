package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Homework {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();


//
//        TC #1: Etsy Title Verification
//        1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to https://www.etsy.com
        driver.navigate().to("https://www.etsy.com ");

//        3. Search for “wooden spoon”
         WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
//        4. Verify title:


        String expectedTile = "Wooden spoon";
        String actualTitle = driver.getTitle();
//        Expected: “Wooden spoon | Etsy”
        if (expectedTile.equals(expectedTile)) ;
        System.out.println("PASSED!");







    }
}
