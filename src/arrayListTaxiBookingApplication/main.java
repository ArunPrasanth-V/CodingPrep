package arrayListTaxiBookingApplication;
import java.util.*;
public class main {
 static Scanner scan=new Scanner(System.in);
	 public static void main(String args[])
	 { 
		 TaxiList.createTaxi(4);
		 int i=0; 
		 do{
		info();
		 System.out.println("press 1 to Continue");
		 i=scan.nextInt();
		 }while(i==1);
	 }
	 public static void info()
	 {
		 System.out.println("---------Taxi Booking--------\n"
			 		+ "1)Taxi Booking\n"
			 		+ "2)Taxi Details\n"
			 		+ "3)Booking Details");
			 int choice=scan.nextInt();
			 switch(choice)
			 {
			 case 1:
					 {//1)Taxi Booking
						 System.out.println("Enter the time");
						 double time=scan.nextDouble();
						 System.out.println("Enter the Starting Point");
						 char spoint=scan.next().charAt(0);
						 System.out.println("Enter the ending Point");
						 char epoint=scan.next().charAt(0);
						 //bookTaxi(String taxiname,char startingplace,char endingplace,double time)
						 int taxiID=TaxiList.istaxiFree(time,spoint);
						 if(taxiID==-1)
						 {
							 System.out.println("sorry taxi cannot Allocated !!");
							 break;
						 }
						 else
				             System.out.println("Taxi "+taxiID+" is Booked at "+time+" clock");
						    Taxi.bookTaxi("Taxi "+taxiID, spoint,epoint, time,taxiID);
						 break;
						 //book-taxiname,spoint,epoint,time
					 }
			 case 2:
					 {//2)Taxi Details
						 TaxiList.taxiDetails();
						 break;
					 }
			 case 3:
					 {//3)Booking Details
						 Taxi.bookingDetails();
						 break;
					 }
			 default: {
				          System.out.println("Wrong Distination try Agin");
			               info();
			           }
			 }
	 }
}
