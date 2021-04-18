package com.automation.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BrowserLaunchTest {

    @Test
    public void launchBrowser()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://testyantra.com/user/login");

       String text=driver.findElement(By.xpath("//input[@id='edit-name']/preceding-sibling::label")).getText();
       if(text.equalsIgnoreCase("username")){
           driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("bhau");
       }


    }
}
