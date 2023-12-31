package com.cydeo.tests.day4_findeElements_checkboxes;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {


//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)
//        a. “Home” link
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class=nav-link"));

        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));

//        b. “Forgot password” header
        WebElement header_ex1= driver.findElement(By.cssSelector("div.example > h2"));

        WebElement header_ex2= driver.findElement(By.cssSelector("//h2[text()='Forgot Password']"));


//        c. “E-mail” text
         WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

//        d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("input//[@name='email']"));

        //Locate inputBox using xpath contains method

        //tagName[contains(@attribute, 'value')]

        WebElement inputBox_ex2 = driver.findElement(By.xpath(" //tagName[contains(@pattern, 'az')]"));

//        e. “Retrieve password” button
        //button[@type= 'submit ']
        //button[@class = radius']
        WebElement retrieve_PasswordBtn  = driver.findElement(By.xpath("//button[@id= 'from_sumbmit']"));

//        f. “Powered by Cydeo text
        WebElement poweredCydeoText = driver.findElement(By.xpath("//div[@style= text-align: center;]"));
//
//       //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1isDisplayed() ="   + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed()  = "    +homeLink_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed()  = "    +emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplay()  =  "     +inputBox_ex1.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed()=" + poweredCydeoText.isDisplayed());











    }

}
