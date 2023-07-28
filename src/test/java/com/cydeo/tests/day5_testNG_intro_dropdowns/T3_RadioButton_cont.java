package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {

//
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #2: Radiobutton handling
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");


        //Loop through the List of WebElement and select matching result "hockey"
        List<WebElement> sportRadioButton = driver.findElements(By.name("hockey"));

//    }
//        private static void clickAndVerifyRadioButton (WebDriver driver, String idValue){
//            List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
//
//            for (WebElement each : RadioButtons) {
//                String eachId = each.getAttribute("id");
//
//
//                if (eachId.equals(idValue)) ;
//
//                each.click();
//                System.out.println("Hockey is selected :" + each.isSelected());
//                break;
//
//
//            }

        }


    }





//        3. Click to “Hockey” radio button
//        4. Verify “Hockey” radio button is selected after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
//




