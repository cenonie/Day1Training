package com.exercise2;

class BaseClass{
	protected void method1() {
		method2();
	}
	
	protected void method2() {
		System.out.println("Base class method 2");
	}
}

class InheritClass extends BaseClass{
	@Override
	protected void method2()
	{
		System.out.println("inherited class method 2, overriden");
	}
}


public class Exercise2Class {

	public static void main(String args[])
	{
		InheritClass inheritObj = new InheritClass();
		BaseClass baseObj = (BaseClass)inheritObj;
		baseObj.method1();
	}
	
}
