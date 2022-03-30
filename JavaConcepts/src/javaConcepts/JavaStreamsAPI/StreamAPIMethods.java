package javaConcepts.JavaStreamsAPI;

import java.util.stream.*;
import java.util.*;

public class StreamAPIMethods {
	public static void main(String[] args) {
		//List of numbers
		List<Integer> nums = Arrays.asList(2,4,7,9,24,43,57,58,65,93,102,43,26,99);
		//List of names
		List<String> names = Arrays.asList("Anky", "Baban", "Tony", "Anthony", "Akbar", "Amar", "Sameer");
		//filter(predicate) --> predicate is boolean value function, which either returns true or false
		// filter will work on boolean return value of predicate
		// e -> {if multiple line then we have to return true or false}
		// e -> if single line then no need to return true or false explicitly
		
		//Print all the numbers in nums list which is <=50
//		nums.stream().filter(i-> i<=50).collect(Collectors.toList()).forEach(System.out::println);
		
		//Filter out all the names which start with letter 'A'
		List<String> namesA = names.stream().filter(s-> s.startsWith("A")).collect(Collectors.toList());
//		System.out.println(names);
//		System.out.println(namesA);
		
		
		
		//map(Function) Function will return value and based on that value it will make the stream
		// MAP will work on return value of function
		//on each element we can perform operation
		
		
		List<Integer> numsSqr = nums.stream().map(i->i*i).collect(Collectors.toList());
//		System.out.print(numsSqr + " ");
		
//		numsSqr.stream().forEach(e -> System.out.print(e + " "));
		
//		numsSqr.stream().forEach(System.out::println);
		
		//sorted method Ascending
		//sort the nums list
		nums.stream().sorted().forEach(System.out::println);
		
		// sort in descending order
		nums.stream().sorted((a,b)->b.compareTo(a)).forEach(e -> System.out.print(e + " "));
		
		//max return type <Optional> thats why using ifPresent 
		nums.stream().max((a,b) ->a.compareTo(b)).ifPresent(System.out::println);
		
		//min
		nums.stream().min((a,b)->a.compareTo(b)).ifPresent(System.out::println);
		
	}
}
