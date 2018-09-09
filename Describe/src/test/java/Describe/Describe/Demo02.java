package Describe.Describe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo02 {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\SeleniumAdvance\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
