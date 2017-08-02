package com.exercise5;

class Dog{
	protected void Bark()
	{
		System.out.println("Arf");
	}
	
	protected void Bark(String bark)
	{
		System.out.println("Howl");
	}
	
	protected void Bark(int bark)
	{
		System.out.println("Woof");
	}
	
	protected void Bark(Boolean bark)
	{
		System.out.println("Grrrr");
	}
	
	protected void Bark(char bark)
	{
		System.out.println("Arf Arf");
	}
}

public class Exercise5 {
	
	
	public static void main(String args[])
	{
		Dog dog = new Dog();
		dog.Bark();
		dog.Bark("string");
		dog.Bark(false);
		dog.Bark(21);
		dog.Bark('a');
	}
}
