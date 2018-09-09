package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver d;
	
@FindBy(id="Email")
static WebElement Text_box_Email;
@FindBy(id="Password")
static WebElement Text_box_password;
@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
static WebElement btn_login;

public void enterLoginData(String u, String p) {
	
	Text_box_Email.sendKeys(u);
	Text_box_password.sendKeys(p);
	btn_login.click();
}

}


