package constructorReference;

import java.util.*;

// Method reference is example of code re-usability
// Or we can say it is a alternative to LAMBDA also 
// Where we are writing lambda we can use method reference

public class ReferenceExUsingStreamMain {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(23,645,34,65,665,7675);
		System.out.println(l1);
		
//		Using Lambda we are printing element of stream
		l1.stream().forEach(e -> System.out.println(e));
		
		//Using method reference 
		l1.stream().forEach(System.out::println);
	}
}
