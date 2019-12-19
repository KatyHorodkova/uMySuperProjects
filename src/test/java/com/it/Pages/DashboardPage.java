package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {
	@FindBy(xpath="//li[@class='sn_menu_item']/span")
	private WebElement lbUserEmail;

	public String getEmailUser(){
	     WebDriverWait wait = new WebDriverWait(driver, 20, 1000);
        wait.until(ExpectedConditions.visibilityOf(lbUserEmail));
        return lbUserEmail.getText();
    }

}
