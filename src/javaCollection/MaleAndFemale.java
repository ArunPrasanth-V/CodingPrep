package javaCollection;
import java.util.*;
import java.util.stream.Collectors;
public class MaleAndFemale {
	
	public static void main(String args[])
	{
		List<Person> people=new ArrayList<>();
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("arun",Gender.MALE));
				
		List<Person> male=new ArrayList<>();
		for(Person malea:people)
		{
			if(Gender.MALE.equals(malea.gender))
			{
				male.add(malea);
			}
		}
		for(Person malea:people)
		{
		   System.out.println(malea);
		}
		
		System.out.println("declarative approach");
		//declarative approach
		people.stream()
		.filter(person->Gender.MALE.equals(person.gender))
		.collect(Collectors.toList()).
		forEach(System.out::println);
		
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
