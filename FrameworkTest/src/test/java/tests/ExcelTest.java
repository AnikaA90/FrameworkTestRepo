package tests;

import org.testng.annotations.Test;

import businessfunctions.BaseClass;
import utilityfunctions.ExcelInfo;

public class ExcelTest extends BaseClass {
	
	@Test
	public void excelDataLogin() {
		int numberOfRows = ExcelInfo.getNumberOfRows();
		
		for (int i=1; i<numberOfRows; i++) {
			BaseClass.loginToApp(ExcelInfo.getData(i, 0), ExcelInfo.getData(i, 1) );
			BaseClass.logoutFromApp();
		}
	}

}
