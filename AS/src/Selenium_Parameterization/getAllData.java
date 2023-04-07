package Selenium_Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\Book1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0; i<=sheet.getLastRowNum(); i++) {
			
			for(int j=0; j<=sheet.getRow(i).getLastCellNum()-1; j++) {
				
				Cell value = sheet.getRow(i).getCell(j);
				
				CellType ct = value.getCellType();
				
				if(ct==CellType.STRING) {
					System.out.print(value.getStringCellValue()+" ");
				}
				else if (ct==CellType.NUMERIC) {
					System.out.print(value.getNumericCellValue()+" ");
				}
				else if (ct==CellType.BOOLEAN) {
					System.out.print(value.getBooleanCellValue()+" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
