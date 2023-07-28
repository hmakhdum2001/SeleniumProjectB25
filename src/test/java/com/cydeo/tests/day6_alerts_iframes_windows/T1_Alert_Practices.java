package com.cydeo.tests.day6_alerts_iframes_windows;



import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

class Task1_Alert_Practice {
    //TC #1: Information alert practice
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts%22");
    }

    @Test
    public void alert_Test1() {
        //3. Click to “Click for JS Alert” button
        WebElement imformationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        imformationAlertButton.click();

        //To be able to click to Alert Ok button we need to switch driver's focus on the alert itself
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "Result text is Not displayed");
        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();
        Assert.assertEquals(actualText, expectedText, "Actual result test is not as expected!!!");

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}
