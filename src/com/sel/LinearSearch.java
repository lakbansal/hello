package com.sel;

public class LinearSearch {
	
	public static void main(String[] args) {
		int arr[]={1,42,3,41,51,6,71,8,91,01};
		int x=9;
		boolean flag=false;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				flag=true;
				System.out.println("No searched was" + arr[i] );
				break;
				
			}
			
		}
		
		if(flag)
		{
			System.out.println("found" + x );
		}
		else
		{
			System.out.println("not found" + x );
		}
		
	}

}
