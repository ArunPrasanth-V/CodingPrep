package javaCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

 public class _Consumer {
	 private static String name;
	 private static String number;
	 private static String address;
	 List <_Consumer>_Consumer=new ArrayList<>();
	 _Consumer(String name, String number,String address)
	 {
		 this.name=name;
		 this.number=number;
		 this.address=address;
	 }
	  
	 public String toString()
	 {
		 
		 return "hi "+name+" Your Number is "+number+" the address : "
				 +address+"\n";
	 }
	 
	 
 public static void main(String args[])
 {
//	Customer maria=new Customer("arun","99999");
//	greetCustomer(maria);
//	 exmaple.accept("arun");
	List<_Consumer> areaName=new ArrayList<>();
	areaName.add(new _Consumer("arun","9943253756","carada"));
	
	areaName.add(new _Consumer("kishore","9943253756","carada"));
	
	areaName.add(new _Consumer("vimal","9943253756","carada"));
	
	areaName.add(new _Consumer("mithin","9943253756","carada"));
	
	areaName.add(new _Consumer("giri","9943253756","carada"));
	

for(int i=0;i<areaName.size();i++)
{
	System.out.println(areaName.get(i));
}
	
 }
 
 


static  Consumer<String> exmaple=exam->System.out.println(exam);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
static BiConsumer<Customer,Boolean> greetCustomerConsumerv2=(customer,showPhoneNumber)->
  
System.out.println("hello"+customer.customerName+",thaks"
		  +(showPhoneNumber?customer.customerPhoneNumber:"****"));
 
 
static Consumer<Customer> greetCustomerConsumer=customer->
  System.out.println("hello"+customer.customerName+",thaks"
		  +customer.customerPhoneNumber);
  
static void greetCustomer(Customer customer)
  {
	  System.out.println("hello"+customer.customerName+",thaks"
	  +customer.customerPhoneNumber);
  }


 
 static class Customer{
	 private final String customerName ;
	 private final String customerPhoneNumber;
	 Customer(String customerName,String customerPhoneNumbe)
	 {
		 this.customerName=customerName;
		 this.customerPhoneNumber=customerPhoneNumbe;
	 }
	 
 }
}
