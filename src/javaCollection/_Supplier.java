package javaCollection;

import java.util.function.Supplier;
import java.util.*;
public class _Supplier {
   public static void main(String args[])
   {
      System.out.println(getConnectionUrl());
   }
   
   static String getConnectionUrl()
   {
	   return"https://youMustGoToCanada";
   }
   static Supplier<String> getConnectionUrlSupplier=()->
   "https://youMustGoToCanada";
   
   static Supplier<List<String>> getConnectionUrlSupplierList=()->
    List.of(
		  "https://youMustGoToCanada",
		  "https://youMustGoToCanada");
}
