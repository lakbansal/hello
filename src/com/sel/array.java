package com.sel;

public class array {
	
	
	
	public static void main(String[] args) {
		
		int ar[]=new int[5];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		int arr[]={1,42,3,41,51,6,71,8,91,01};
		 for (int i=0;i<arr.length;i++)
	       {
	    	   System.out.println(arr[i]);
	    	   
	       }
		
	
       for (int i=0;i<5;i++)
       {
    	   System.out.println(ar[i]);
    	   
       }
       
       for (int x : ar)
       {
    	   
    	   System.out.println(x); 
       }
		
	}

}
