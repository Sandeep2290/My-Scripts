package pack1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdddatatoExcel {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileInputStream f = new FileInputStream("./Input-Data/data.xlsx");
		Workbook book = WorkbookFactory.create(f);
		book.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Sandeep");
		FileOutputStream f1 = new FileOutputStream("./Input-Data/data.xlsx");
		book.write(f1);
	}
}
