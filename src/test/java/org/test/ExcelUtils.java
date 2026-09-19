package org.test;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public void createCellAndSetCellData(String sheetName, int rowno, int cellno, String data) throws IOException {

		File file = new File("C:\\Users\\USER\\eclipse-workspace\\my-app\\TESTDATA\\MyApptestdata1.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowno);

		Cell cell = row.createCell(cellno);

		cell.setCellValue(data);

		FileOutputStream fileOutputStream = new FileOutputStream(file);

		workbook.write(fileOutputStream);

	}

	public void updateCellData(String sheetName, int rowno, int cellno, String oldData, String newData)

			throws IOException {

		File file = new File(

				"C:\\Users\\USER\\eclipse-workspace\\my-app\\TESTDATA\\MyApptestdata1.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowno);

		Cell cell = row.getCell(cellno);

		DataFormatter dataFormatter = new DataFormatter();

		String value = dataFormatter.formatCellValue(cell);

		if (value.equals(oldData)) {

			cell.setCellValue(newData);

		}

		FileOutputStream fileOutputStream = new FileOutputStream(file);

		workbook.write(fileOutputStream);

	}

	public String getCellData(String sheetName, int rowno, int cellno) throws IOException {

		File file = new File(

				"C:\\Users\\USER\\eclipse-workspace\\my-app\\TESTDATA\\MyApptestdata1.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowno);

		Cell cell = row.getCell(cellno);

		DataFormatter dataFormatter = new DataFormatter();

		String value = dataFormatter.formatCellValue(cell);

		return value;

	}

}
