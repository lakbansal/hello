package com.interf;

public class Honda extends Car implements FunctionInterface,ComponentInterface {

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windows() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		
	}
	
	public void dimensions()
	{
		int l= 120;
		int b=80;
		int h=60;
		System.out.println("lenght is "+l+"breadth is "+b+"height is"+h);

	}
	
	public static void main(String[] args) {
		Car car=new Honda();
		car.dimensions();
	}

}
