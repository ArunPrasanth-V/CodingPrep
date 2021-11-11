package arrayListTaxiBookingApplication;
import java.util.*;
public class Taxi extends Thread {
	String taxiname;
	char startingplace;
	char endingplace;
	double freetime;
	double totalAmount;
	Taxi(String taxiname,char startingplace,char endingplace,double freetime,double totalAmount)
	{
		this.taxiname=taxiname;	
		this.startingplace=startingplace;
		this.endingplace=endingplace;
		this.freetime=freetime;
		this.totalAmount=totalAmount;
	}
     static int bookingid=0;
    static List<Taxi>bookingList=new ArrayList<>();
   public static void bookTaxi(String taxiname,char startingplace,char endingplace,double time,int taxiID)
   {
	   
	   TaxiList temp=TaxiList.newTaxi.get(taxiID);
	   temp.isTaxifree=false;
	   temp.currentPoint=startingplace;
	   
	   double taxiBecomeFree=startingplace>endingplace?startingplace-endingplace
				 :endingplace-startingplace;
	    bookingid++;
	    
	    temp.availableTime+=taxiBecomeFree;
	    double cost=moneyCalculation(taxiBecomeFree);
	    temp.totalEarnig+=cost;
	    bookingList.add(new Taxi(taxiname, startingplace,endingplace,taxiBecomeFree,cost));
	    //totalAmount,freetime,bookid; 
	    Thread t1=new Thread(()->
		{
			try {Thread.sleep(10000);}catch(Exception e) {}
			temp.currentPoint=endingplace;
		});
	    t1.start();
	    TaxiList.newTaxi.set(taxiID, temp);

	    
   }
   public String toString()
   {
	   return taxiname+" will become free within "+freetime+" hours at "+endingplace+" Total cost: "+totalAmount;
   }

    
   public static double moneyCalculation(double taxiTravellingTime)
   {
	                            //km
	   taxiTravellingTime=((taxiTravellingTime*15)-10)*5+(500);
	   return taxiTravellingTime;
   }
   public static void bookingDetails()
   {
	   for(int i=0;i<bookingList.size();i++)
   	{
   		System.out.println(bookingList.get(i));
   	}
   }
   
  
}
