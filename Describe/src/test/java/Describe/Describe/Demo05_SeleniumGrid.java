package Describe.Describe;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo05_SeleniumGrid {
  @Test
  public void f() {
	  
	  
  }
  
  @BeforeTest
  public void setup() throws MalformedURLException {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setBrowserName("Chrome");
	  dc.setPlatform(Platform.WINDOWS);
	  RemoteWebDriver driver= new RemoteWebDriver(new URL("https://192.168.56.1:5656"),dc);
	  
	  
	  
  }
}
