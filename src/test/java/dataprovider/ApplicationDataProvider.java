package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApplicationDataProvider {
	
	XSSFWorkbook wb;

	public ApplicationDataProvider() {

		File src = new File("./ApplicationTestData/AppData.xlsx");
		try {
			FileInputStream file = new FileInputStream(src);
			wb=new XSSFWorkbook(file);
			

		} catch (Exception e) {

			System.out.println("Exception is"+e.getMessage());
		}

	}
	
	
	public String getData(int sheetIndex,int row,int column){
		
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
		
	}
	
public String getSheetname(int sheetname,int row,int column){
		
		String data1 = wb.getSheetAt(sheetname).getRow(row).getCell(column).getStringCellValue();
		
		return data1;
		
		
	}

}
