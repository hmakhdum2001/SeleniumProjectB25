package com.cydeo.tests.day2_locaters_getText_getAttribute;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_cydeoPractice {

        public static void main(String[] args) {

//        TC #1: Cydeo practice tool verifications
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
//        1. Open Chrome
//        2. Go to https://practice.cydeo.com
                driver.navigate().to("https://practice.cydeo.com");

                String expectedURL = "cydeo";
                String actualURL = driver.getCurrentUrl();

                //        3. Verify URL contains
//        Expected: cydeo
                if (actualURL.contains(expectedURL)){
                        System.out.println("URL PASS - Name Matches");

                }else{
                        System.out.println("URL Fail - Name does not match");
                }

//        4. Verify title:
                String expectedTitle = "Practice";
                String actualTitle = driver.getTitle();

//        Expected: Practice
                if (actualTitle.equals(expectedTitle)){
                        System.out.println("Title Matches - PASSED");
                }else {
                        System.out.println("Title Does Not Match - Failed");
                }

driver.close();

        }
}
