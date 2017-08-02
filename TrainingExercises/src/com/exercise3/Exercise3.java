package com.exercise3;

class Rodent{
	protected String name = "", color = "", size = "", tailLength = "";
	
	protected void setCharacteristics() {
		name = "rodent";
		color = "unknown";
		size = "unknown";
		tailLength = "unknown";
	}
	
	protected void display() {
		System.out.println("Name of Rodent: " + name + "\n");
		System.out.println("Color of Rodent: " + color + "\n");
		System.out.println("Size of Rodent: " + size + "\n");
		System.out.println("Tail Length of Rodent: " + tailLength + "\n\n");
	}
	
}

class Rat extends Rodent{
	@Override
	protected void setCharacteristics() {
		name = "Rat";
		color = "Black or White";
		size = "Small";
		tailLength = "very Long";
	}
}

class Hamster extends Rodent{
	@Override
	protected void setCharacteristics() {
		name = "Hamster";
		color = "brown or white";
		size = "small";
		tailLength = "long";
	}
}

class Beaver extends Rodent{
	@Override
	protected void setCharacteristics() {
		name = "Beaver";
		color = "Brown";
		size = "Medium";
		tailLength = "Thick and long";
	}
}


public class Exercise3 {
	public static void main(String args[])
	{
		Rat rat = new Rat();
		Hamster hamster = new Hamster();
		Beaver beaver = new Beaver();
		Rodent[] rodents = {rat, hamster, beaver};
		for(Rodent rodent: rodents)
		{
			rodent.setCharacteristics();
			rodent.display();
		}
	}
}
