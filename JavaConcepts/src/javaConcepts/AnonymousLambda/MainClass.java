package javaConcepts.AnonymousLambda;

//LAMBDA ONLY WORKS WITH FUNCTIONAL INTERFACE -> AN INTERFACE HAVING ONLY ONE ABSTRACT METHOD

//IF THERE ARE MORA THAN ONE ABSTRACT MEHTOD IN INTERFACE THEN WE NEED TO USE ANONYMOUS CLASS 

public class MainClass {
	public static void main(String[] args) {
		animalMovement eagle = new eagleClass("Reacher");
		// 1ST Way to use this function is by implementing the Interface
		
		//TO use movement function of animalMovement Interface, 
		// first we have to implement class which implements it's functions,
		// then create object of it anf then caal the movement function using that object.
		eagle.movement("FLY LIKE CHARM");
		
		// 2nd Way is by using Anonymous class out of it.
		
		//Anonymous class implementing animalMovement Interface
		//Here we are not making object of interface, we are making object of child of animalMovement Interface implementation
		animalMovement mvmt = new animalMovement() {
								public void movement(String move) {
									System.out.println("This is first Anonymous class " + move);
								}
							};
		mvmt.movement("FLY LIKE A CHARM");
		
		animalMovement mvmt2 = new animalMovement() {
									public void movement(String move) {
										System.out.println("This is second Anonymous class " + move);
									}
								};
		mvmt2.movement("RUN LIKE A CHEETAH");
		
		//Using out FunctionalInterface with the help of LAMBDA(We remove name of method, return type, modifier from the function)
		
		//
		animalMovement mvmt3 = (name) -> System.out.println("Here we are calling Lambda " + name);
		mvmt3.movement("SWIM LIKE WHALE");
		mvmt3.movement("SLEEP LIKE BEAR");
		
		sumInterface si = (a,b) -> a+b;
		System.out.println(si.sum(3,4));
		System.out.println(si.sum(300,360));
		
		lengthInter len = s -> s.length();
		System.out.println(len.getLength("EclipseDay"));
		
	}
}
