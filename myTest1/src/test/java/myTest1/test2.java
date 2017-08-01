package myTest1;

class ClassA{
	ClassA(){
		System.out.println("This is class A");
	}
}

class ClassB{
	ClassB(){
		System.out.println("This is class B");
	}
}

class ClassC extends ClassA{
	ClassB objB= new ClassB();
	
	protected void testClassC(String a, String b)
	{
		System.out.println(a + " " + b);
	}
}

public class test2 {

	public static void main(String args[])
	{
		ClassC objC = new ClassC();
		objC.testClassC("a","b");
	}
	
}
