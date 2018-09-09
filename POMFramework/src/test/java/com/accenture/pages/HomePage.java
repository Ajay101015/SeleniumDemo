package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver d;
	
@FindBy(linkText="Log in")
static WebElement LoginLink;
public void clickLogin() {
	LoginLink.click();
}
	


}
