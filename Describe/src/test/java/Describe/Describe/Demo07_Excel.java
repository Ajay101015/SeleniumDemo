package Describe.Describe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo07_Excel {
	  WebDriver driver;
	  
	
  @Test
  public void f() throws IOException {
	  driver.get("https://demowebshop.tricentis.com");
	  FileInputStream fin=new FileInputStream("C:\\Users\\pdc2b-training.pdc2b\\Desktop\\LoginSheet.xlsx");
	  XSSFWorkbook H= new XSSFWorkbook(fin);
	  XSSFSheet s=H.getSheet("LoginTest");
	  int rowcount=s.getLastRowNum();
 for(int i=0;i<=rowcount;i++) {
	 
	 String username=s.getRow(0).getCell(0).getStringCellValue();
	 String password=s.getRow(0).getCell(1).getStringCellValue();
	 
	 logintest(username,password);
		 try {
			 driver.findElement(By.linkText("Log out")).click();
			 
	 }catch(Exception e) {
		
	 }
 }
	  
	
  }
 
@BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\SeleniumAdvance\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
  }
  public void logintest(String UN,String PW) {
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys(UN);
	  driver.findElement(By.id("Password")).sendKeys(PW);
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
