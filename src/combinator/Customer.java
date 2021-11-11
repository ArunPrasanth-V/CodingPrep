package combinator;

import java.time.LocalDate;

public class Customer {

	private final String name;
    private final  String email;
    private final String  phone;
    private final LocalDate dop;

    public Customer(String name, String  email, String  phone, LocalDate dop) {
		this.phone = phone;
		this.name=name;
		this.email=email;
		this.dop=dop;
		
	}
    static LocalDate getDob(LocalDate dop)
    {
    	 return dop; 
    }
    static String getPhoneNUmber(String phone)
    {
    	 return phone; 
    }
    static String getEamil(String email)
    {
    	 return email; 
    }
    
}
