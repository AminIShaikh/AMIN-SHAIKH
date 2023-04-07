package Selenium_Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getWholeRow {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\Book2.xlsx");
		
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		short data = sheet1.getRow(0).getLastCellNum();
		System.out.println(data);
		
		for(int i=0; i<data; i++) {
			System.out.println(sheet1.getRow(0).getCell(i).getStringCellValue());
		}
	}

}
