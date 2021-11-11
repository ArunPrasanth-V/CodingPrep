import java.util.*;
public class BookingDetails {
	int bookingID;String taxiName;char startingPoint;char endingpoint;double time, totalAmount;
	static List<BookingDetails>bookingDetails=new ArrayList<>(); 
	BookingDetails (int bookingID,String taxiName,char startingPoint,char endingpoint,double time,double totalAmount)
	{
		this.bookingID=bookingID;
		this.taxiName=taxiName;
		this.startingPoint=startingPoint;
		this.endingpoint=endingpoint;
		this.time=time;
		this.totalAmount=totalAmount;
	}
	public static void viewAllBooking()
	 {
		 for(int i=0;i<bookingDetails.size();i++)
		 {
			 System.out.println(bookingDetails.get(i));
		 }
	 }
	public String toString()
	{
		return taxiName +" is Booked at "+bookingID+" ID FROM "+startingPoint+" TO "+endingpoint+" cost : "+totalAmount+" $ "+ "Time : "+time;
	}
	public static double moneyCalculator(char spoint,char epoint)
	{
		int hour=spoint>epoint?spoint-epoint:epoint-spoint;
		hour=((hour*15)-10)*5+500;
		return hour;
	}
	
}
