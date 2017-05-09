package com.collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {
	

	public static void main(String[] args) {
		
		Vector<String> arrlist=new Vector<String>();
		arrlist.add("Apple");
		arrlist.add("Banana");
		arrlist.add("Guvava");
		arrlist.add("lime");
		arrlist.add("orange");
		arrlist.add("Mango");
		arrlist.add("Leachy");
		arrlist.add("Leachy1");
		arrlist.remove(0);
		arrlist.remove(0);
		arrlist.toString();
		for (int i=0;i<arrlist.size();i++)
		{
			System.out.println(arrlist.toString());
			
		}
		

}
}
