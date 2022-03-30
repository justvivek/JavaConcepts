package javaConcepts.JavaStreamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		List<Person> people = getPeople();
		
		//Imperative Approach
		
		/*
		//List of all females from the Person List
		List<Person> females = new ArrayList<>();
		for(Person person: people) {
			if(person.getGender().equals(Gender.FEMALE))
				females.add(person);
		}
		
		females.forEach(System.out::println);
		*/
		
		//Declarative Approach
		
		
		//Get list of all females from list of people
		
		// filter
		List<Person> females = people.stream()
					.filter(person -> person.getGender().equals(Gender.FEMALE))
					.collect(Collectors.toList());
		
		//print list of all females
//		females.forEach(System.out::println);
		
		//Sort List of People according to age in Ascending order
		// sort
		List<Person> sortedList = people.stream()
												.sorted(Comparator.comparing(Person::getAge))
												.collect(Collectors.toList());
		//print list of all people sorted based on their Age
//		sortedList.forEach(System.out::println);
		
		//Sort List of People according to age in Descending order
		List<Person> sortedListReverse = people.stream()
														.sorted(Comparator.comparing(Person::getAge).reversed())
														.collect(Collectors.toList());
		//print list of all people sorted based on their Age in Reverse oerder
//		sortedListReverse.forEach(System.out::println);
		
		// Does all people in this list have age>=18 and age<100
		List<Person> bet18And50 = people.stream().filter(p-> p.getAge()>=18 && p.getAge() <=60).collect(Collectors.toList());
		bet18And50.forEach(System.out::println);
		//All match
		// Does all people in this list have age>18
		boolean ageGT18 = people.stream()
					  .allMatch(person -> person.getAge() >18);
//		System.out.println(ageGT18);
		
		
		//Any Match
//		Do we any person in list whose age is greater than 100
		boolean ageGT100Any = people.stream()
										.anyMatch(person -> person.getAge() >100);
		
//		System.out.println(ageGT100Any);
		
		//Do we any person in list whose age is less than 18
		boolean ageLT18Any = people.stream()
										.anyMatch(person -> person.getAge() <18);
//		System.out.println(ageLT18Any);
		
		//None Match
		boolean nonematch = people.stream()
										.noneMatch(person -> person.getName().equals("Trumph"));
//		System.out.println(nonematch);
		
		//Max
		//To find person with max age in the list
		people.stream()
					.max(Comparator.comparing(Person::getAge));
//					.ifPresent(System.out::println);
		//Min
		
		Optional<Person> min = people.stream()
							             	.min(Comparator.comparing(Person::getAge));
//		min.ifPresent(System.out::println);
		
		//Group
		//Group By Gender all the people in the list
		Map<Gender, List<Person>> groupByGender = people.stream()
														 .collect(Collectors.groupingBy(Person::getGender));
//		groupByGender.forEach((gender, people1) -> {
//			System.out.println(gender);
//			people1.forEach(System.out::println);
//		});
		
		//Chaining
		// get all the females and find oldest among them and return the first name
//		people.stream()
//					.filter(people1 -> people1.getGender().equals(Gender.FEMALE))
//					.max(Comparator.comparing(Person::getAge))
//					.ifPresent(System.out::println);
		
		Optional<String> oldestFemale = people.stream()
													.filter(people2 -> people2.getGender().equals(Gender.FEMALE))
													.max(Comparator.comparing(Person::getAge))
													.map(Person::getName);
//		oldestFemale.ifPresent(System.out::println);
	}	
	
	private static List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("James Bond", 20, Gender.MALE));
		people.add(new Person("Shaktimaan", 67, Gender.MALE));
		people.add(new Person("WonderWoman", 28, Gender.FEMALE));
		people.add(new Person("Laura", 30, Gender.FEMALE));
		people.add(new Person("Iron Man", 45, Gender.MALE));
		people.add(new Person("Captain", 99, Gender.MALE));
		people.add(new Person("Witch", 120, Gender.FEMALE));
		return people;
	}
}
