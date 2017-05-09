package com.sel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ScannerSearch {
static Scanner sc;
	public static  void loadscanner()
	{
	
		
		File f=new File("././SeleniumFramework/config/config.txt");
        
        	try {
				sc = new Scanner(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("" + sc.findInLine("google"));

	
}
}
public static void main(String[] args) {
	ScannerSearch.loadscanner();
}	
}
