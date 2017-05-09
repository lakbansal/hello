package com.collection;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		
		int [] arr={1,2,12,14,37,23,78,122,34,78};
		
		int l=arr.length;
		int tem=0;
		for(int i=0;i<=l-1;i++)
		{
			
			for(int j=0;j<l-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					tem=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tem;
				}
				
			}
		}
		
		for (int k=0;k<=l-1;k++)
		{
			System.out.println(arr[k]);
			
		}
		
		
	}

}
