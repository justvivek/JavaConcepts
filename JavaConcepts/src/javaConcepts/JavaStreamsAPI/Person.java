package javaConcepts.JavaStreamsAPI;

public class Person {
	private final String name;
	private final Gender gender;
	private final int age;
	
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Person {"+ "name = '"+ name + '\''+ ", Age = " + age + ", Gender = "+ gender + "}";
	}
	
}
