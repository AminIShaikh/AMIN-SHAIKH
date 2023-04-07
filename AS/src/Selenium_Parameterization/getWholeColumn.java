package Selenium_Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getWholeColumn {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\Book2.xlsx");
		
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		int data = sheet1.getLastRowNum();
		System.out.println(data);
		
		for(int i=0; i<=data; i++) {
			String value = sheet1.getRow(i).getCell(3).getStringCellValue();
			
			System.out.println(value);
		}
	}

}
