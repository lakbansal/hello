package com.sel;

import java.util.Hashtable;

public class MapClass {
	
	public static void main(String[] args) {
		
		Hashtable <Integer,String> h=new Hashtable<Integer,String>();
		h.put(1, "Mango");
		h.put(2, "Apple");
		h.put(3, "banana");
		h.put(4, "orange");
		System.out.println(h.get(1));
	}

}
