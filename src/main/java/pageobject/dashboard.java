package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	WebDriver driver;
public	dashboard(WebDriver driver)
	{
		this.driver=driver;
	}
	//public Login dashboard(WebDriver driver)
	
	
		public Login logout()
		{
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/header/div/nav[2]/ul/li[3]/img")).click();
		driver.findElement(By.partialLinkText("Sign Out")).click();
		//return new Login(driver);
		return PageFactory.initElements(driver, Login.class);
		}
		
	}


