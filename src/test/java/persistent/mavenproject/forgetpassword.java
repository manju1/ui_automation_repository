package persistent.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class forgetpassword {
  @Test
  public void f() {
 WebDriver driver=new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.get("http://wordpress.com/");
	
	  driver.findElement(By.xpath("/html/body/header/div/ul/li/a")).click();
	
  }
  
}
