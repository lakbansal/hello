package com.core;

public class KTM extends Bike{
	
	double l;
	double b;
	double h;
	
	KTM()
	{
		l=1.7;
		b=.49;
		h=.33;
		
	}
	
	public void dimension()
	{
		System.out.println(l);
		System.out.println(h);
		System.out.println(b);
	}
	public void run()
	{
		
		System.out.println("KTM run at 200km/hr");
		System.out.println("KTM sporty bike so run very fast");
	}
	
	
	

	public void tyredimension()
	{
		System.out.println("KTM tyre dimension 60*80");
		
	}
	

}
