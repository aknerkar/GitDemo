package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\nerka\\Documents\\Book1practice.xlsx");
			
	String login =	WorkbookFactory.create(file).getSheet("signin").getRow(1).getCell(2).getStringCellValue();
			System.out.println(login);
			
			
			
		} 

	
	}


