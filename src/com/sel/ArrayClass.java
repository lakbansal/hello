package com.sel;

public class ArrayClass {
	
public static void main(String [] args)
		{
	
	int array[]={1,2,3,4,5,6,7,8,9};
	int a=5;
	ArrayClass v=new ArrayClass();
	v.find(array,a);
	v.find(array,99);
	
	
	
	
		}
public void find(int array[],int no)

{
	boolean flag=false;
for (int a=0;a<array.length;a++)
	{

if(no==array[a])
{
	flag=true;

	break;


}}

if(flag)
{
	System.out.println("number was found :" + no);
}
else
{
	System.out.println("not found :" + no);
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	

}
