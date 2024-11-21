package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider 
{
	@DataProvider(name = "LoginInData")
	public String[][] getData() throws IOException
	{
		String path = ".\\testdata\\logindata.xlsx";
		
		ExcelUtilities xlutil = new ExcelUtilities(path);
		
		int totalRows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);
		
		String logindatas[][] = new String[totalRows][totalcols];
		
		for(int i = 1; i <= totalRows; i++)
		{
			for(int j = 0; j <= totalcols; j++)
			{
				logindatas[i-1][j] = xlutil.getCellData("Sheet1", i, j);
			}
		}
		
		return logindatas;
	}
}
