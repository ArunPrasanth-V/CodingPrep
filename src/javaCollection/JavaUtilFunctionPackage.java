package javaCollection;

import java.util.*;
import java.util.function.Predicate;

import javaCollection.MaleAndFemale.Gender;
import javaCollection.MaleAndFemale.Person;

public class JavaUtilFunctionPackage {
	 public void newMethod()
	 {
		 List<Person> people=new ArrayList<>();
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("arun",Gender.MALE));
		   people.add(new Person("arun",Gender.MALE));
		   Predicate<Person> personpredecate=
				   person->Gender.MALE.equals(person.gender);
		   //if condition in collecion is predicate
				   
		   people.stream().filter(personpredecate)
		   .forEach(System.out::println);
	 }
}
