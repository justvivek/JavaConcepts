package javaConcepts.JavaStreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// STREAM API -- USED FOR PROCESSING COLLECTION / GROUP OF OBJECTS
// COLLECTION / GROUP OF OBJECTS
public class WaysToCreateStreamObject {
	public static void main(String[] args) {
		
		//1st Way to make empty stream
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
		
		//2nd Way --- array, object, collection
		String[] names = {"Bob","Dylan","Murphy","Bose"};
		Stream<String> s1 = Stream.of(names);
		s1.forEach(e-> System.out.print(e + " "));
		
		//3 builder pattern
		Stream<Object> s3 = Stream.builder().build();
		
		//4 Using arrays
		IntStream s4 = Arrays.stream(new int[] {1,4,7,2,5,9});
//		s4.forEach(System.out::println);
		
		//Cannot casr IntStream to Stream
//		Stream<Integer> s5 = Arrays.stream(new int[] {1,4,7,2,5,9});
//		s5.forEach(System.out::println);
		
		//5 List, Set
		
		List<Integer> l1 = Arrays.asList(2,4,7,9,24,43,57,58,65,93,102,43,26,99);
		Stream<Integer> s5 = l1.stream();
		s5.forEach(System.out::println);
		
	}
}
