/*
package com.example.yixin.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileUtil{

    */
/**
     * 创建 xlsx 文件
     * @param fileName
     *//*


    public void createXSLS(String fileName) {
        Workbook wb = new XSSFWorkbook();
        try (OutputStream fileOut = new FileOutputStream(fileName + ".xlsx")) {
            wb.write(fileOut);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    */
/**
     * 创建工作表
     * @param fileName
     * @param sheetName
     *//*


    public void createSheet(String fileName,String sheetName) {
        Workbook wb = new XSSFWorkbook();  // or new XSSFWorkbook();
//        Sheet sheet1 = wb.createSheet("new sheet");
//        Sheet sheet2 = wb.createSheet("second sheet");
//        String safeName = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]"); // returns " O'Brien's sales   "
        String safeName = WorkbookUtil.createSafeSheetName(sheetName); // 返回安全的工作表名称
        Sheet sheet3 = wb.createSheet(safeName);
        try (OutputStream fileOut = new FileOutputStream(fileName + ".xlsx")) {
            wb.write(fileOut);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getXLSX() {
        // import org.apache.poi.ss.usermodel.*;
        DataFormatter formatter = new DataFormatter();
        Workbook wb = new XSSFWorkbook();
        Sheet sheet1 = wb.getSheetAt(0);
        for (Row row : sheet1) {
            for (Cell cell : row) {
                CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                System.out.print(cellRef.formatAsString());
                System.out.print(" - ");
                // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
                String text = formatter.formatCellValue(cell);
                System.out.println(text);
                // Alternatively, get the value and format it yourself
                switch (cell.getCellType()) {
                    case CellType.STRING:
                        System.out.println(cell.getRichStringCellValue().getString());
                        break;
                    case CellType.NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.println(cell.getDateCellValue());
                        } else {
                            System.out.println(cell.getNumericCellValue());
                        }
                        break;
                    case CellType.BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                    case CellType.FORMULA:
                        System.out.println(cell.getCellFormula());
                        break;
                    case CellType.BLANK:
                        System.out.println();
                        break;
                    default:
                        System.out.println();
                }
            }
        }

    }

}
*/
