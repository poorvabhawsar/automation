package com.slokam.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {

	FileOutputStream fos= null;
	Workbook workbook = null;
	Sheet sheet = null;
	public ExcelManager() {
		File file = new File("./Report_"+System.currentTimeMillis()+".xlsx");
		try {
			fos = new FileOutputStream(file);
			workbook = new XSSFWorkbook();
			sheet = workbook.createSheet("Jira Report");
			createHeaders();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void createHeaders() {
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0,CellType.STRING);
		cell.setCellValue("S.No");
		
		cell = row.createCell(1,CellType.STRING);
		cell.setCellValue("TicketId");
		
		cell = row.createCell(2,CellType.STRING);
		cell.setCellValue("ActualTime");
		
		cell = row.createCell(3,CellType.STRING);
		cell.setCellValue("ActualCost");
		
		cell = row.createCell(4,CellType.STRING);
		cell.setCellValue("EstimatedCost");

	}
	
	public void writeToReport(List<Ticket> list) {
		for (int i = 0; i < list.size(); i++) {
			Ticket ticket = list.get(i);
			Row row = sheet.createRow(i+1);
			Cell cell = row.createCell(0,CellType.STRING);
			cell.setCellValue(ticket.getSno());
			
			cell = row.createCell(1,CellType.STRING);
			cell.setCellValue(ticket.getTicketId());
			
			cell = row.createCell(2,CellType.STRING);
			cell.setCellValue(ticket.getActualTime());
			
			cell = row.createCell(3,CellType.STRING);
			cell.setCellValue(ticket.getActualCost());
			
			cell = row.createCell(4,CellType.STRING);
			cell.setCellValue(ticket.getEstimatedCost());
		}
		
		try {
			workbook.write(fos);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
