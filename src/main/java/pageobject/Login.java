package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	public	Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public dashboard login(String username, String pasword)
	{
		/*
		 driver = new FirefoxDriver();
		driver.get("http://wordpress.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/header/div/ul/li/a")).click();
		  */
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(pasword);
		  driver.findElement(By.id("wp-submit")).click();
	//return new dashboard(driver);
		 return PageFactory.initElements(driver, dashboard.class);

}
}
