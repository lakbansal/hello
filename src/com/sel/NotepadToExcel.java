package com.sel;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import java.util.ArrayList;

public class NotepadToExcel {
	public static String browser;
	public static String chromedriverpath;
    static String  s;
    static String[] var= new String [2];
    static String[] a=new String[3];
	public static void loadbufferreader() throws IOException, RowsExceededException, WriteException
    {
		int row=0;
		int column=0;
		WritableWorkbook workbook =Workbook.createWorkbook(new File("output.xls"));
	    WritableSheet sheet = workbook.createSheet("Sheet1", 0);
		FileReader f=new FileReader("./files/notepadtoexcel.txt");
		BufferedReader br=new BufferedReader(f);
		while((s = br.readLine()) != null){
        var = s.split(":");
		a=var[1].split(",");
		System.out.println(var[0]);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
  	    Label heading = new Label(column, row,var[0]);
        sheet.addCell(heading);
        Label content0 = new Label(column, row+1,a[0]);
        sheet.addCell(content0);
        Label content1 = new Label(column, row+2,a[1]);
        sheet.addCell(content1);
        Label content2 = new Label(column, row+3, a[2]);
        sheet.addCell(content2);
        column=column+1;
		}
		workbook.write();
		workbook.close();
		br.close();
    }
      public static void main(String[] args) throws RowsExceededException, WriteException {
		  	try {
			NotepadToExcel.loadbufferreader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
