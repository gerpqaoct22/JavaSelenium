package oct22.day9_TestNGAndCucumber;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public String[][] fetchData() throws IOException 
	{
	
	//Step1: Access the WorkBook
		XSSFWorkbook workbook = new XSSFWorkbook("./oct22data/AdminNameDynamicParametrization.xlsx");
	
	//Step1: Access the WorkSheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
	//Step3: Access the data up to lastRow
		int rowCount = sheet.getLastRowNum();
		
		System.out.println("Row Count is:" + rowCount);
		
	//Step4: Access the data up to lastColumn
	short colCount = sheet.getRow(rowCount).getLastCellNum();
	
	System.out.println("Column Count is:" + colCount);
	
	String[][] data = new String[rowCount][colCount];
	
	for (int row = 0; row<rowCount; row++)
	{
		for (int col=0; col<colCount; col++)
		{
			XSSFCell cell = sheet.getRow(row).getCell(col);
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
			data[row][col] = stringCellValue;
			
		}
	}
	
	workbook.close();
	return data;
	

	}

}
