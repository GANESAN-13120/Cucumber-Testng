package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Data {
	
	
public static void read_All_Data() throws IOException {
		
		File f = new File("C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\XL_Document\\GANESAN XL DOCUMENT.xlsx");
	
	    FileInputStream fis = new FileInputStream(f);
	    //upcasting
	    Workbook wb = new XSSFWorkbook(fis); 
	    
	    Sheet sheetAt = wb.getSheetAt(0);
	    
	    int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	    
	    for(int i=0; i<numberOfRows;i++) {
	    	
	    	Row row = sheetAt.getRow(i);
	    	
	    	int cells = row.getPhysicalNumberOfCells();
	    	
	    	for(int j=0;j<cells;j++) {
	    		
	    		Cell cell = row.getCell(j);
	    		
	    		CellType cellType = cell.getCellType();
	    		
	    		if(cellType.equals(cellType.STRING)) {
	    			
	    			String stringCellValue = cell.getStringCellValue();
	    			
	    			System.out.println(stringCellValue);}
	    			
	    			else if(cellType.equals(cellType.NUMERIC)) {
	    				
	    				double numericCellValue = cell.getNumericCellValue();
	    				
	    				int data =(int) numericCellValue;//narrowcasting 
	    				System.out.println(data);
	    			}
	    		}
	    	}
	    	
      
	    }

        public static void main(String[] args) throws IOException {
			
        	read_All_Data();
		}

}



