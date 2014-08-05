package persistent.mavenproject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data {
  @Test(dataProvider="moviedata")
  public void f (String moviename, String hero,String  heroine)
  {
	  String object[][];
  System.out.println("movie details"+ moviename +" " + hero +" " + heroine);
	  
  }
  @DataProvider
  public Object[][] moviedata()
  {
	  Object[][] movielist=new Object[2][3];
	  movielist[0][0]="movie1";
	  movielist[0][1]="hero1";
	  movielist[0][2]="heroine1";
	  movielist[1][0]="movie2";
	  movielist[1][1]="hero2";
	  movielist[1][2]="heroine2";
	  return movielist;
  }
}
