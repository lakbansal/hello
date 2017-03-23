package com.core;

public class HeroHonda extends Bike {
	
	double l;
	double b;
	double h;
	
	HeroHonda()
	{
		l=1.5;
		b=.45;
		h=.25;
		
	}
	
	
	public void run()
	{
		
		System.out.println("hero honda run at 160km/hr");
		System.out.println("KTM normal bike so run less speed");
	}
	
	public void tyredimension()
	{
		System.out.println("herohonda tyre dimension 60*70");
		
	}
	
	

}
