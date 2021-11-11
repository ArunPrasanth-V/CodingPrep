import java.util.Scanner;


public class ZohoTaxiBookingApplication {
	static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    {  TaxiDetails.createTaxi(4);
    	int n=0;
    	do {
    	info();
    	System.out.println("Press 1 to Continue ! ");
    	n=scan.nextInt();
    	}while(n==1);
    }
    public static void info()
    {
    	
    	System.out.println("Enter Your Choice !\n"
    			+ "1)Taxi Booking\n"
    			+ "2)Taxi Details\n"
    			+ "3)Booking Details");
         int choice=scan.nextInt();
         switch(choice)
         {
         case 1:
         {//1)Taxi Bookin
        	 System.out.println("Enter the Timing : ");
        	 double time=scan.nextDouble();
        	 System.out.println("Enter the Starting Point :");
        	 char spoint=scan.next().charAt(0);
        	 System.out.println("Enter the Ending Point :");
        	 char epoint=scan.next().charAt(0);
        	 int taxiId=TaxiDetails.checkTaxiIsFree(spoint,epoint,time);
        	 int boking_id=TaxiDetails.changeTaxiDetails(taxiId,spoint,epoint,time);
        	 System.out.println("Taxi "+taxiId+" Booked successfully");
        	System.out.println(BookingDetails.bookingDetails.get(boking_id)); 
        	 break;
         }
         case 2:
         {
        	 TaxiDetails.viewAllTaxi();
        	 break;
         }
         case 3:
         {
        	 BookingDetails.viewAllBooking();
        	 break;
         }
         default:
         {
        	 System.out.println("Plz Enter The Correct information");
              break;
         }
         }
    }
}
