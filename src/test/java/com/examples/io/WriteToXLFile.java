package com.examples.io;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

/**
 * Created by janesh on 7/14/2015.
 */
public class WriteToXLFile {


    public static void main(String[] args) {
        String fileName= "E:\\PTL\\scienceLand\\PIMS\\reports\\23May2015\\PIMS-OpenBugs-and-DSI-2015-05-23.xls";

        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = new HSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet("Sheet1");
            sheet.getRow(0).getCell(0).setCellValue("Hello Selenium ");
            fileInputStream.close();

            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}



