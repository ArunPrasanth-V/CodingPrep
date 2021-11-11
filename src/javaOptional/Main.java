package javaOptional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
  public static void main(String args[])
  {
	  Supplier<IllegalStateException> exception =()
			  ->new IllegalStateException("exception");
			  
			  
	  Optional.ofNullable(null)
			  .ifPresentOrElse(mail->System.out.println("senting a mail  +"+mail)
			  ,()->{
				    System.out.println("cannot sent a mail"); 
	                });
	  
//	  .orElseThrow(exception);
//	  System.out.println(value);
  }
}
