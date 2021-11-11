package javaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import javaCollection.MaleAndFemale.Gender;
import javaCollection.MaleAndFemale.Person;

public class _Stream {
  
	public static void main(String args[])
	{
		List<Person> people=new ArrayList<>();
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("aruna",Gender.FEMALE));
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("arun",Gender.MALE)); 
		  
//		   Function<Person,String> personToStringFunction=person->person.name;
//           IntConsumer println=System.out::println;
//           ToIntFunction<String>lenght=String::length;
//           
           
//		  people.stream()
//		       .map(person->person.name)
//		       //.collect(Collectors.toSet())
//		       .mapToInt(String::length)
//		       .forEach(System.out::println);
		   
		   Predicate<Person> personPredicate=person->Gender.FEMALE.equals(person.gender);
		   boolean containsOnlyFemales=people.stream()
		         .anyMatch(personPredicate);
	     System.out.println(containsOnlyFemales);
	}
	
	static class  Person
	{
	     String name;
		 Gender gender;
		
		 Person(String name,Gender gender)
		  {
			this.name=name;
			this.gender=gender;	
		  }
		 public String toString()
		  {
			return "person{"+
		        "name ='"+name+'\''+", gender ="+gender+'}';
		 }
	}
      enum Gender{
	           MALE,FEMALE
                 }
}
