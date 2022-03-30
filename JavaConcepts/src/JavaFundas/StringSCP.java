package JavaFundas;

public class StringSCP {
	public static void main(String[] args) {
		//Object using new will be created in heap area
		//Object created using literal will be created in String Constant Pool Area
		String s1 = new String("alpha");
		String s2 = "alpha";
		
		System.out.println(s1.hashCode());
		System.out.println(s1.intern().hashCode() == s2.hashCode());
		//both s1 and s2 are referring to alpha at different location
		System.out.println(s1 == s2);//false
		//Take reference of s1 from SCP using intern() method
		System.out.println(s1.intern() == s2); //true

	}
}
