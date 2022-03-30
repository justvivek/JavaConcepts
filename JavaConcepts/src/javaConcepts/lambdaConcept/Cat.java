package javaConcepts.lambdaConcept;

public class Cat implements Printable{
	public String name;
	public String age;
	
	public Cat() {}
	
	public void printl(String s1, String s2) {
		System.out.println("Meow "+ s1 + " "+ s2);
	}
}
