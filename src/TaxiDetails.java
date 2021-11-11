import java.util.*;
public class TaxiDetails {
	String taxiName;char CurrentPoint;double TotalEaring;double totalOrder,startingTime;
	boolean isfree;
	static int bookingID=0;
	TaxiDetails (String taxiName,char CurrentPoint,double TotalEaring,boolean isfree,double totalOrder,double startingTime)
	{
		this.taxiName=taxiName;
		this.CurrentPoint=CurrentPoint;
		this.TotalEaring=TotalEaring;
		this.totalOrder=totalOrder;
		this.startingTime=startingTime;
	    this.isfree=isfree;
	}
	static List<TaxiDetails> taxiDetails=new ArrayList<>();
	public static  void createTaxi(int n)
	{
		for(int i=0;i<n;i++)
		{
			taxiDetails.add(new TaxiDetails("Taxi "+i,'A',0.0,true,0,6));
		}
	}
	
	public static int  checkTaxiIsFree(char spoint,char epoint,double time)
	{
		for(int i=0;i<taxiDetails.size();i++)
		{
			TaxiDetails temp=taxiDetails.get(i);
			 if(temp.isfree==true)
			 {
				 return i;
			 }
		}
			
		return -1;
	}
	public static int changeTaxiDetails(int taxiId,char spoint,char epoint,double time)
	{
		if(BookingDetails.bookingDetails.size()!=0)
		   bookingID++;
		TaxiDetails temp=taxiDetails.get(taxiId);
		temp.CurrentPoint=spoint;
		
		
		Thread t1=new Thread(()->{
		try {Thread.sleep(1000);
		temp.CurrentPoint=epoint;
		temp.startingTime=time;
		}catch(Exception e) {}});
		
		temp.isfree=false;
		double d=BookingDetails.moneyCalculator(spoint,epoint);
		temp.TotalEaring+=d;
		temp.totalOrder++;
	//	bookingID,String taxiName,char startingPoint,char endingpoint,double time,double totalAmount)
		BookingDetails.bookingDetails.add(new BookingDetails(bookingID,"Taxi "+taxiId,spoint,epoint,time,d));
		taxiDetails.set(taxiId, temp);
		t1.start();
		
		return bookingID;
	}

	 public static void viewAllTaxi()
	 {
		 System.out.println(taxiDetails.size());
		 for(int i=0;i<taxiDetails.size();i++)
		 {
			 System.out.println(taxiDetails.get(i));
		 }
	 }
	@Override
	public String toString() {
		return "TaxiDetails [taxiName=" + taxiName + ", CurrentPoint=" + CurrentPoint + ", TotalEaring=" + TotalEaring
				+ ", totalOrder=" + totalOrder + ", startingTime=" + startingTime + ", isfree=" + isfree + "]";
	}

	
}
