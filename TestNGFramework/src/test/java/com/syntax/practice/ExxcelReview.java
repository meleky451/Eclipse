package com.syntax.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExxcelReview {
	@Test
	public void readExcel() throws IOException {
		
		
		String xlpath="src/test/resources/Testdata/Book.xlsx";
		
		FileInputStream fis=new FileInputStream(xlpath); 
		//open workbook
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//open specified sheet
		
		XSSFSheet sheet=workbook.getSheet("EmployeeDetails");
		//access value of specified cell
		String value=sheet.getRow(6).getCell(0).toString();
		System.out.println(value);
		//get number of rows and cols
		int rows =sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of rows and cols: " +rows+ " " +cols);
		//get value from each cell 1 by 1
		
		for(int a=0; a<rows; a++) {
			for(int b=0; b<cols; b++) {
				
				String cellVal=sheet.getRow(a).getCell(b).toString();
				System.out.println(cellVal);
			}
			
			
			 System.out.println();
        }
        workbook.close();
        fis.close();
    }
	
}