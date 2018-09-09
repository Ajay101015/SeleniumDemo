package com.accenture.test;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class LoginTest {
	WebDriver driver;
	HomePage h;
	LoginPage l;
	
  @Test
  public void Logintest() {
	  driver.get("http://demowebshop.tricentis.com/");
	  h.clickLogin();
	  l.enterLoginData("ajay00patidar", "123456");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\SeleniumAdvance\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  h=PageFactory.initElements(driver, HomePage.class);
	  l=PageFactory.initElements(driver, LoginPage.class);
  }

  @AfterTest
  public void afterTest() {
  }

}
