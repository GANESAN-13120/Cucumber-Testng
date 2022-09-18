package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
public static void write_Data() throws IOException {
		
		File f = new File("C:\\Users\\iSHIELD\\Desktop\\GANESAN XL DOCUMENT.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		//1st Row
		wb.createSheet("Data3").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("Data3").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("Data3").getRow(0).createCell(2).setCellValue("Date");
		wb.getSheet("Data3").getRow(0).createCell(3).setCellValue("Remark");
		//2nd Row
		wb.getSheet("Data3").createRow(1).createCell(0).setCellValue("Raja");
		wb.getSheet("Data3").getRow(1).createCell(1).setCellValue("@1234");
		wb.getSheet("Data3").getRow(1).createCell(2).setCellValue("01.08.2022");
		wb.getSheet("Data3").getRow(1).createCell(3).setCellValue("Good");
		//3rd Row
        wb.getSheet("Data3").createRow(2).createCell(0).setCellValue("Kumar");
		wb.getSheet("Data3").getRow(2).createCell(1).setCellValue("@4567");
		wb.getSheet("Data3").getRow(2).createCell(2).setCellValue("02.08.2022");
		wb.getSheet("Data3").getRow(2).createCell(3).setCellValue("Good");
		//4th Row
		wb.getSheet("Data3").createRow(3).createCell(0).setCellValue("Ravi");
		wb.getSheet("Data3").getRow(3).createCell(1).setCellValue("@6789");
		wb.getSheet("Data3").getRow(3).createCell(2).setCellValue("03.08.2022");
		wb.getSheet("Data3").getRow(3).createCell(3).setCellValue("Good");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("Successful");
		}
	
	public static void main(String[] args) throws IOException {
		
		write_Data();
		
	}


}
