package arrayListTaxiBookingApplication;
import java.util.*;
public class TaxiList {
	String TaxiName;char currentPoint;double totalEarnig;boolean isTaxifree;double availableTime;
	TaxiList(String TaxiName,char currentPoint,double totalEarnig,boolean isTaxifree,double availableTime)
	{
		this.TaxiName=TaxiName;this.currentPoint=currentPoint;this.totalEarnig=totalEarnig;this.isTaxifree=isTaxifree;this.availableTime=availableTime;
	}
 static List<TaxiList> newTaxi=new ArrayList<>();
	public static void createTaxi(int n)
	{
		for(int i=0;i<n;i++)
		{
			newTaxi.add(new TaxiList("Taxi "+i,'a',0.00,true,6));
		}
	}
	
	static List<TaxiList> freeTaxi=new ArrayList<>();
	public static int istaxiFree(double time,char spoint)
	{
		int totaltaxi=newTaxi.size();
		for(int i=0;i<totaltaxi;i++)
		{
			TaxiList temp=newTaxi.get(i);
			if(temp.isTaxifree==true)
			{
				return i;
			}
		}
		return -1;
	}
	public String getTaxiName() {
		return TaxiName;
	}
	public void setTaxiName(String taxiName) {
		TaxiName = taxiName;
	}
	public char getCurrentPoint() {
		return currentPoint;
	}
	public void setCurrentPoint(char currentPoint) {
		this.currentPoint = currentPoint;
	}
	public double getTotalEarnig() {
		return totalEarnig;
	}
	public void setTotalEarnig(double totalEarnig) {
		this.totalEarnig = totalEarnig;
	}
	public boolean isTaxifree() {
		return isTaxifree;
	}
	public void setTaxifree(boolean isTaxifree) {
		this.isTaxifree = isTaxifree;
	}
	public double getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(double availableTime) {
		this.availableTime = availableTime;
	}
	
	public String toString()
	{
		return TaxiName +"         "+currentPoint+"            "+totalEarnig+"             "+isTaxifree+"        "+availableTime;
	}
	
	public static void taxiDetails()
	   {
		System.out.println
	("Taxi --- CurrentPoint --- TotalEarnig --- IsTaxiFree --- AvailableTime");
	
		for(int i=0;i<newTaxi.size();i++)
		{
			System.out.println(newTaxi.get(i));
		}
	   }
}
