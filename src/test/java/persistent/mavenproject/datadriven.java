package persistent.mavenproject;
import java.io.*;

import org.testng.annotations.Test;

import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class datadriven {
  @Test
  public void f() throws JXLException, IOException {
	  
	  /* 
	  Workbook book=Workbook.getWorkbook(new File("./src/test/test.xls"));
	  Sheet sheet=book.getSheet("Sheet1");
	  String value1=sheet.getCell(0,0).getContents();
	  System.out.println(value1);
	  book.close();
	  
	  
	  WritableWorkbook newbook = Workbook.createWorkbook(new File("./src/test/mytest.xls"));
	  WritableSheet sheet= newbook.createSheet("master",0);
	  Label l1=new Label(0,0,"hello");
	  sheet.addCell(l1);
	  newbook.write();
	  newbook.close();
	  
	  */
	  Workbook oldcopy= Workbook.getWorkbook(new File("./src/test/test.xls"));
	  WritableWorkbook newcopy=Workbook.createWorkbook(new File("./src/test/copytest.xls"), oldcopy);
	  WritableSheet sheet1 = newcopy.getSheet(0);
	  Label l2=new Label (3,4,"copied content");
	  sheet1.addCell(l2);
	  newcopy.write();
	  oldcopy.close();
	  newcopy.close();
	  
	  
	  
  }
}
