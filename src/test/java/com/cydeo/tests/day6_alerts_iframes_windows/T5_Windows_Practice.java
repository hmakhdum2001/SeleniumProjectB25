package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/windows");
    }
      @Test
      public void multiple_window_test(){

     //Storing the main page's window handle as string good practice for future re_usable purpose
      String mainHandle = driver.getWindowHandle();

          System.out.println("mainHandle = " + mainHandle);

//          4. Assert: Title is “Windows”
          String expectedTitle = "Windows";
          String actualTitle = driver.getTitle();


//          5. Click to: “Click Here” link
          WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
//
          clickHereLink.click();

//         6. Switch to new Window.

//          7. Assert: Title is “New Window”


      }


}
