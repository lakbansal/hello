package com.sel;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
	public static void main(String[] args) {

	ArrayList<Integer> arrlist=new ArrayList<Integer>();
	arrlist.add(90);
	arrlist.add(9);
	arrlist.add(67);
	arrlist.add(4);
	arrlist.add(7);
	arrlist.add(45);
	arrlist.add(11);;
	Collections.sort(arrlist);
	
	for (int i=0;i<arrlist.size();i++)
	{
		System.out.println(arrlist.toString());
		
	}


	}
}
