package javaConcepts.JavaStreamsAPI;

import java.util.*;
import java.util.stream.*;

public class MoreOnStreamsAPI {
	public static void main(String[] args) {
//		List<Integer> l1 = List.of(2,4,6,9,11,15,23,34,56);
		List<Integer> l1 = Arrays.asList(2,4,7,9,24,43,57,58,65,93,102,43,26,99);
		
		//Without stream
		//extract even numbers from list l1
		List<Integer> leven = new ArrayList<>();
		for(int i: l1) {
			if(i%2 == 0)
				leven.add(i);
		}
//		System.out.println(l1);
//		System.out.println(leven);
		
		//With Streams API
		
//		Stream<Integer> strm = l1.stream();
//		List<Integer> lseven = strm.filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println(l1);
//		System.out.println(leven);
//		System.out.println(lseven);
		
		//Concise manner
		List<Integer> lseven = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(lseven);
		
		 List<Integer> lgrtr50 = l1.stream().filter(i->i>50).collect(Collectors.toList());
		 System.out.println(lgrtr50);
		 
		 
		 l1.stream().filter(i->i>50).collect(Collectors.toList()).forEach(System.out::print);
		
	}
}
