package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

    }

    @Test
    public void Iframe_Test(){

        // We need to switch driver focus to iframe
        // option-1 switch to iframe using id attribute value
        // driver.switchTo().frame("mce_0_ifr");

        //option-2 passing index number of iframe
        driver.switchTo().frame(0);

        //option-3 locate as a web element and pass the in frame
        //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=mce_0_ifr]")));

        // Locate the p page
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //Verify "An Iframe containing the Tiny WYSIWYG editor
        // To be able to verify the header we must switch back yo "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        // assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}