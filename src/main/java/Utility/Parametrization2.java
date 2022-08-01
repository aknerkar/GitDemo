package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization2 {

	public static String getData(int row,int cell) throws EncryptedDocumentException, IOException {
		
		  FileInputStream file = new FileInputStream("C:\\Users\\nerka\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\Selenium Excel.xlsx");
	      String value=	WorkbookFactory.create(file).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
		  return value;  
		
		 
	}	
} 
