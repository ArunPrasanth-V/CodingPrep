package javaCollection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String args[])
	{
	
	int inc=incrementByOneFunction.apply(0);
	System.out.println(inc);
	int multi=multipleby10.apply(10);
	System.out.println(multi);
	
	System.out.println(incrementByOneAndMutiply(4,10));
	
	
	}
	//BiFunction
	 static BiFunction<Integer,Integer,Integer> incrementByOnreMulti=
				(incrementByOneFunction,multipleby10)->(incrementByOneFunction+1)*multipleby10;

	
	
	
		
	//Function in collection
	Function<Integer,Integer> addmuti1=incrementByOneFunction.andThen(multipleby10);
	//System.out.println(addmuti1.apply(2));
	
	static Function<Integer,Integer> incrementByOneFunction=
	    number->number+1;
	static Function<Integer,Integer> multipleby10=num->num*10;
	    
	static int incrementByOneAndMutiply(int number,int numtoMultiply)
	{
		return ++number*numtoMultiply;
	}
}
