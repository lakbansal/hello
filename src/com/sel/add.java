package com.sel;

public class add {
	
	int x;
	int y;
	int z;
	int a;
	int b;
	int c;
	public static void main (String[] args)
	{
		add a=new add();
		a.sum();
		
		a.multiply();
	}

	public void sum()
	{
		
		x=2;
		y=3;
		z=x+y;
		System.out.println(z);
		}
	public void multiply()
	{
		a=3;
		b=6;
		c=a*b;
	System.out.println(c);			
		
	}
}
