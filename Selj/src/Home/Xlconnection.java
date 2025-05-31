package Home;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;  



import jxl.Workbook;
import jxl.read.biff.BiffException; 

public class Xlconnection {

	public static void main(String[] args) throws BiffException, IOException
	{
		Workbook wb=Workbook.getWorkbook(new File("C:\\Users\\kotha\\Downloads\\SeleniumTesting.xls.xls"));
        
		Sheet sh=wb.getSheet("Sheet1");
		
		for(int i=0;i<sh.getRows();i++)
		{  
		  System.out.println("Username is"+sh.getCell(0,i).getContents());
		  System.out.println("Password is"+sh.getCell(1,i).getContents());
		
	    }

}
}
