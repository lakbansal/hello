package com.sel;

public class InterfaceImpl implements InterFaceExample{
	
	int a=10;
	int b=2;
	int c=0;
	static InterFaceExample IE;

	@Override
	public void Add() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		
	}
	
	
	public static void main(String [] args)
	{
		IE=new InterfaceImpl();
		IE.Add();
		
	}

}
