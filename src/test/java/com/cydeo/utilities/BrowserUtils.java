package com.cydeo.utilities;

// In this class only general utility methods that are not related to some specific page.

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {


    //This method will accept int (in second and execute Thread.sleep
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL:" + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                System.out.println(driver.getCurrentUrl());
                System.out.println(expectedInUrl);
                System.out.println("break");
                break;
            }


        }
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        System.out.println(expectedInTitle);

        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }


    public static void verifyTitle(WebDriver driver, String expectedTitle ){

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
}



