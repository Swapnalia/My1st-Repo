package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Double_value {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\SWAPNALI\\OneDrive\\Documents\\Automation\\Excel\\Book1.xlsx");
	 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet1");

	 Row myrow = mysheet.getRow(1);
	 Cell mycell = myrow.getCell(0);

	CellType type = mycell.getCellType();
	System.out.println("cell type is "+type);
	}
	// in this excel reading we found the the type of data present in the cell
	// string /numeric/or boolean.
	
	// for that use file class then workbookfactory class and create method
	// after that get sheet/row/cell type store it in ref variable
	//and prrint
	
	
	
	
	
	

}
