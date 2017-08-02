package com.exercise1;

class Cycle{
	protected String type = "Cycle";
	
	protected void ride() {
		System.out.println("I am riding a " + type + "\n");
	}
}

class Bicycle extends Cycle{
	Bicycle(){
		type = "Bicycle";
	}
}

class Unicycle extends Cycle{
	Unicycle(){
		type = "Unicycle";
	}
}

class Tricycle extends Cycle{
	Tricycle(){
		type = "Tricycle";
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle bike = new Bicycle();
		Cycle uni = new Unicycle();
		Cycle trike = new Tricycle();
		
		bike.ride();
		uni.ride();
		trike.ride();
	}

}
