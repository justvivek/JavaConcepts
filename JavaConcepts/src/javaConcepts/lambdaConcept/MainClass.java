package javaConcepts.lambdaConcept;

public class MainClass {
	public static void main(String[] args) {
//		Cat cat = new Cat();
		
//		printThing(cat);
	
		// We can do this way now we don't need to create class which extends Printable Interface
		// and define printl() method, but with lambdas we don't need to do all this.
		// Now with the help of lambdas we can directly create expression that contains implementation of functional interface.
		// It allows us to effectively treat code as parameter
//		printThing(
//				( s ) -> {
//			System.out.println("Meow lambda "+ s);
//				}
//				);
		
		
		//We can do this way
//		printThing(s -> System.out.println("Meow Lambda "+ s));
		
		//We can do this way also
		// we have provided definition of functional interface method in lambda and pass it as argument to method printThing
		Printable thingLambda = (s1, s2) -> System.out.println(s1 + " Meow Lambda "+ s2);
		printThing(thingLambda);
		
		
	}
	
	public static void printThing(Printable thing) {
		thing.printl("Kya bolti hai Billi?? ", "bolti hai billi :P");
	}
}
