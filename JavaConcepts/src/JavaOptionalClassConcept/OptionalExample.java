package JavaOptionalClassConcept;

import java.util.Optional;

//Optional class concept in Java8 is used to "avoid" NillPointerException
// To handle the null values exception in the classes
//Optional class is Wrapper to handle null checks
public class OptionalExample {
	
	// if our method return either a valid value or null, then its good practice to use Optional class
	// it makes developer life easier as they can take that value in Optional reference and check the value.
	public static Optional<String> getName(){
		String s1 = "MyName";
		return Optional.ofNullable(s1);
	}
	public static void main(String[] args) {
		String str ="Java is going strong";
		String str2 = null;
		if(str == null)
			System.out.println("String is null");
		else 
			System.out.println("String length is:- "+ str.length());
//		
		//Using Optional
		
//		Optional<String> opt = Optional.of(str2);
		Optional<String> opt = Optional.ofNullable(str2);
		System.out.println(opt.isPresent());
//		System.out.println(opt.get());
		
		System.out.println(opt.orElse("String is Empty"));
		
		Optional<String> s1= getName();
		System.out.println(s1.orElse("Method returned the null value"));
		
	}
}
