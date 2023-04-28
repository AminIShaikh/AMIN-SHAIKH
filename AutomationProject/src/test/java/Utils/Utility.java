package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void CaptureScreenShot(WebDriver driver,int testID) throws IOException {
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH mm ss");
		LocalDateTime now = LocalDateTime.now();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("test-output//ScreenShots//Test-" + testID + " "+ date.format(now) + ".jpeg");
		
		FileHandler.copy(source, dest);
	}
	
	public static String getDatafromExcelSheet(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:Users\\Hp\\OneDrive\\Desktop\\Book2.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		Cell ct = sh.getRow(row).getCell(cell);
		
		String data = ct.getStringCellValue();
		
		return data;
		
	}
	

    public static String getDataFromExcel(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		String data = "no Data" ;
		FileInputStream file = new FileInputStream("C:Users\\Hp\\OneDrive\\Desktop\\Book1.xlsx");
		
		Cell getCell = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell);
		
		try {
			data = getCell.getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value = getCell.getNumericCellValue();
			data = String.valueOf(value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(data);
		return data;
	}
}


