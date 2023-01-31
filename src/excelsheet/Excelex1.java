package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelex1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("C:\\Users\\SWAPNALI\\eclipse\\Swapnali java\\Excel Study.xlsx");
	     
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		  String hello = mysheet.getRow(0).getCell(0).getStringCellValue();
		  System.out.println(hello);
		
		// how to read data from whole complete row..>cell are vary ....  
		  for(int i=0;i<=4;i++)// rows constant
		  {
			  String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			  System.out.println(value +" ");
		  }
		  // here only cell varying...
		  /*if we want to read whole data from cell then row will be vary
		   * cell will constant.
		   * */
		  System.out.println("=================================");
		  
		  for(int i=0;i<=4;i++)// cell constant
		  {
			  String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			  System.out.println(value +" ");
		  }
		  
	}

}
