package utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInfo {

	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet1 = null;
	
	public static void getSheet() {
		try {
			workbook = new XSSFWorkbook("C:\\Users\\grn_a\\eclipse-workspace\\FrameworkTest\\ExcelData\\LoginInfo.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet1 = workbook.getSheet("Sheet1");
	}
	
	public static int getNumberOfRows() {
		getSheet();
		int numberOfRows = sheet1.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		return numberOfRows;
	}
	
	public static int getNumberOfCloumns() {
		getSheet();
		int numberOfColumns = sheet1.getRow(0).getLastCellNum();
		System.out.println(numberOfColumns);
		return numberOfColumns;
	}
	
	public static String getData(int row, int coloumn) {
		getSheet();
		String Data = sheet1.getRow(row).getCell(coloumn).getStringCellValue();
		return Data;
	}
}
