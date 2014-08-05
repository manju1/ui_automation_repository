package testclasses;

import pageobject.Login;
import pageobject.dashboard;

public class pageobjectclass {
	
	Login log;
	dashboard dash;
	
public void testing()
{
	
	log.login("kuleshdeshmukh@gmail.com", "wordpress@847");
	System.out.println("login done succesfully");
	dash.logout();
	System.out.println("logout done succesfully");
}
	
	
	

}
