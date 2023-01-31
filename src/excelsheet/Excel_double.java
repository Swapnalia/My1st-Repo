package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_double {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	File myfile=new File("C:\\Users\\SWAPNALI\\OneDrive\\Documents\\Automation\\Excel\\Book1.xlsx");
	
	double value = WorkbookFactory.create(myfile).getSheet("sheet2").getRow(1).getCell(0).getNumericCellValue();
	
	System.out.println("value is "+value);
	
	
	
	
	
	}

}
