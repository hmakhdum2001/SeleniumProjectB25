package com.cydeo.tests.day4_findeElements_checkboxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) {

//        Practice: Checkboxes
//        1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath(""));
        WebElement checkbox2 = driver.findElement(By.xpath(""));

//        2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isSelected(),  expecting falls " + checkbox1.isSelected());

//        3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected(), expecting true  " + checkbox2.isSelected());
//        4. Click checkbox #1 to select it.
//        5. Click checkbox #2 to deselect it.
//        6. Confirm checkbox #1 is SELECTED.
//        7. Confirm checkbox #2 is NOT selected.





    }
}
