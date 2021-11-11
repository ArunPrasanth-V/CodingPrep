package combinator;

import java.time.LocalDate;

public class Main {
  public void main (String args[])
  {
	  Customer customer=new Customer(
			  "Arun",
			  "arun@gmail.com",
			  "199432544",
			  LocalDate.of(2002, 1,1));
	  
	  System.out.println(new ClassValidator().isValid(customer));
  }
}
