package combinator;

import java.time.LocalDate;
import java.time.Period;

public class ClassValidator {

	public boolean isEmailValid(String email)
	{
		return email.contains("@");
	}
	public boolean isphoneNumberValid(String phoneNumber)
	{
		return phoneNumber.startsWith("1");
	}
	public boolean isDOBValid(LocalDate dob)
	{
		return Period.between(dob, LocalDate.now()).getYears()>16;
	}
	
	public boolean isValid(Customer customer)
	{
		return isEmailValid(customer.getEamil())&&
				isphoneNumberValid(customer.getPhoneNUmber())&&
				isDOBValid(coustomer.getDob());
				
	}
}
