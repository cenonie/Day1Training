package com.exercise2;

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
	
	public void balance() {
		System.out.println(type + " is balanced\n");
	}
}

class Unicycle extends Cycle{
	Unicycle(){
		type = "Unicycle";
	}
	
	public void balance() {
		System.out.println(type + " is balanced\n");
	}
}

class Tricycle extends Cycle{
	Tricycle(){
		type = "Tricycle";
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cycle bike = new Bicycle();
		Cycle uni = new Unicycle();
		Cycle trike = new Tricycle();
		
		Cycle[] cycles = {bike,uni,trike};
		for(Cycle cycle : cycles) {
//			cycle.balance();
/*- cannot do so because the cycle main class doesn't have a balance method	
 * -upcasting hides the methods of the subclass
*/		
			
			if(cycle instanceof Bicycle) {
				Bicycle bicycle = (Bicycle) cycle;
				bicycle.balance();
			}
			else if(cycle instanceof Tricycle) {//instanceof means it checks if it can be casted to the subclass
				Tricycle tricycle = (Tricycle) cycle;
				System.out.println("Tricycle doesnt have a balance method\n");//will return error since tricycle does not have balance
			}
			else if(cycle instanceof Unicycle) {
				Unicycle unicycle = (Unicycle) cycle;
				unicycle.balance();
			}
		}
	}

}
