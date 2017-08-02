package com.exercise6;

class Tank{
	private boolean isFull = false;
	private String name = "";
	
	Tank(String Name)
	{
		name = Name;
	}
	
	protected void fill() {
		if(!isFull) {
			isFull = true;
			System.out.println(name +" tank is filled");
		}else {
			System.out.println(name + " tank is already full, cannot be filled anymore");
		}
	}
	
	protected void empty() {
		if(isFull)
		{
			isFull = false;
			System.out.println(name + " tank is emptied");
		}
		else {
			System.out.println(name+ " tank is already empty, cannot be emptied anymore");
		}
	}
	@Override
	protected void finalize() throws Throwable
	{	
		if(isFull) {
			System.out.println(name + " is still full and disposed");
		}
		else {
			System.out.println(name + " is disposed as empty");
			super.finalize();
		}
	}
}

public class Exercise6 {
	public static void main(String args[])
	{
		Tank tank = new Tank("tank1");
		tank.fill();
		tank.empty();
		tank = null;
		new Tank("tank3").fill();
		new Tank("tank4").empty();
		
		Tank tank2 = new Tank("tank2");
		tank2.fill();
		System.gc();
		tank2.empty();
		
	}
}
