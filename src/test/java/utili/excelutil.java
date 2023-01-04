package utili;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelutil {
	public static void main(String args[]) throws Exception
	{
		excelutil read=new excelutil();
		read.getdata("Sheet1");
	}
	
	
	public String[][] getdata(String excelsheetname) throws Exception
	{
		File f=new File(System.getProperty("C:\\Users\\jayam\\eclipse-workspace\\Miniproj\\src\\test\\resources\\testdata\\data.xlsx"));
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(excelsheetname);
		
		int totrows=sh.getLastRowNum();
		System.out.println(totrows);
		Row rowcells=sh.getRow(0);
		int totalcols=rowcells.getLastCellNum();
		System.out.println(totalcols);
		
		
		String testData[][]=new String[totrows][totalcols];
		DataFormatter format=new DataFormatter();
		for(int row=1;row<totrows;row++)
		{
			for(int col=0;col<totalcols;col++)
			{
				testData[row-1][col]=format.formatCellValue(sh.getRow(row).getCell(col));
			}
			
		}
		
		
		return testData;
		
	}

}
