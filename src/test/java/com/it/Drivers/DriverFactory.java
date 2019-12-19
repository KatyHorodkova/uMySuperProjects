package com.it.Drivers;

import com.it.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.server.handler.DeleteSession;

public class DriverFactory {
    public static final String USERNAME = "katyhorodkova1";
    public static final String AUTOMATE_KEY = "SFNK6u4keHWZp5x2qq2M";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver getDriver() {
        WebDriver driver = null;
        String property = System.getProperty("driver");
        if("gecko".equals(property)) {
            System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (("Browserstack".equals(property)) ){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "62.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1024x768");
            caps.setCapability("name", "Bstack-[Java] Sample Test");

            try {
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            driver = new ChromeDriver();
            }

        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);

        return driver;
    }
}