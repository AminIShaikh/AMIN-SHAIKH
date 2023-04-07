package Selenium_Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericCellValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\Book1.xlsx");
		
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println(data);
	}

}
