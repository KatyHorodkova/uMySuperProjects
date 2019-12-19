package com.it.Pages;

import com.it.Drivers.DriverFactory;
import com.it.Drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static MyDriver driver = MyDriver.getDriver();



    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
