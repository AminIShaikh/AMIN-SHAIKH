package Selenium_Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLastRowNumber {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\Book1.xlsx");
		
		int lastRowNumber = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(lastRowNumber);
		
		//will show index of last row
		//we have to add +1 to get actual number of rows
		//System.out.println(lastRowNumber+1);
		
		
	}  
	

}
