package persistent.mavenproject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.get("http://wordpress.com/");
	
	  driver.findElement(By.xpath("/html/body/header/div/ul/li/a")).click();
	
	  driver.findElement(By.id("user_login")).sendKeys("kuleshdeshmukh@gmail.com");
	  
	  driver.findElement(By.id("user_pass")).sendKeys("wordpress@847");
	  
	  driver.findElement(By.id("wp-submit")).click();
  }
}
