package FinalOfTheseSEction;

import java.util.function.Consumer;

public class Main {
   public static void main(String args[])
   {
	   hello("Arun",null,value->
	   {
	     System.out.println("No LastName Provided for "+value);
	   });
   }
   static void hello(String firstName,String lastName,Consumer<String> callback)
   {
	   System.out.println(firstName);
	   if(lastName!=null)
	   {
		   System.out.println(lastName);
	   }
	   else
		   callback.accept(firstName);
   }
}
