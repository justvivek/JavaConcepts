package javaConcepts.AnonymousLambda;

public class eagleClass implements animalMovement {
	String name;
	eagleClass(String name){
		this.name = name;
	}
	public void movement(String move) {
		System.out.println(this.name + " "+ move);
	}
}
