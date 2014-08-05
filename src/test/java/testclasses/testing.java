package testclasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.Login;
import pageobject.dashboard;


public class testing {
	Login log;
	dashboard dash;
	WebDriver driver;
	private static Logger logs = Logger.getLogger(testing.class);
	
	//@FindBy(xpath = "/html/body/header/div/ul/li/a")
//	WebElement login_link;

	@Test
	public void firstlogin() {
		driver = new FirefoxDriver();
		DOMConfigurator.configure("log4j.xml");
		driver.get("http://wordpress.com/");
		logs.info("url is opened successfully");
		logs.error("hello there");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//login_link.click();
	driver.findElement(By.xpath("/html/body/header/div/ul/li/a")).click();
	logs.info("clicked succesfully");
		//log=new Login(driver);
		log= PageFactory.initElements(driver, Login.class);
		dash = log.login("kuleshdeshmukh@gmail.com", "wordpress@847");
		System.out.println("login done succesfully");
		log = dash.logout();
		System.out.println("logout done succesfully");
	}

}
