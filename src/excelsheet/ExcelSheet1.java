package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//for this first we have to create one excel sheet and stored it into files.
		//create a object of file class
		File myfile=new File("C:\\Users\\SWAPNALI\\OneDrive\\Documents\\Automation\\Excel\\Book1.xlsx");
		
		//we save data in excel in string type so used string
		 String value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("value is "+value);
		

	}

}
