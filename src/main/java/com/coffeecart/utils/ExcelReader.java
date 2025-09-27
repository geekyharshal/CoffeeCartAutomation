package com.coffeecart.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {
    
    public Object[][] getTestData(String sheetName) {
        Object[][] data = null;
        try {
            FileInputStream fis = new FileInputStream("resources/testdata.xlsx");
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            
            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();
            
            data = new Object[rowCount][colCount];
            
            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i-1][j] = getCellValue(cell);
                }
            }
            
            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
    public Map<String, String> getCoffeeItems() {
        Map<String, String> coffeeItems = new HashMap<>();
        try {
            FileInputStream fis = new FileInputStream("resources/testdata.xlsx");
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet("CoffeeItems");
            
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                String itemName = getCellValue(row.getCell(0)).toString();
                String price = getCellValue(row.getCell(2)).toString();
                coffeeItems.put(itemName, price);
            }
            
            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return coffeeItems;
    }
    
    private Object getCellValue(Cell cell) {
        if (cell == null) return "";
        
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return cell.getNumericCellValue();
            case BOOLEAN:
                return cell.getBooleanCellValue();
            default:
                return "";
        }
    }
}