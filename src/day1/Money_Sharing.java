package day1;

public class Money_Sharing {
  public static void main(String args[])
  {//500,200,100,50,20,10,5,1
	  System.out.println("The Count :");
	  int amount=2378;
	  
	  if(amount>=2000)
	  {
		  System.out.println("2000 "+amount/2000);
		  amount%=2000;
	  }
	  if(amount>=500)
	  {
		  System.out.println("500 "+amount/500);
		  amount%=500;
	  }
	  if(amount>=200)
	  {
		  System.out.println("200 "+amount/200);
		  amount%=200;
	  }
	  if(amount>=100)
	  {
		  System.out.println("100 "+amount/100);
		  amount%=100;
	  }
	  if(amount>=50)
	  {
		  System.out.println("50 "+amount/50);
		  amount%=50;
	  }
	  if(amount>=20)
	  {
		  System.out.println("20 "+amount/20);
		  amount%=20;
	  }
	  if(amount>=10)
	  {
		  System.out.println("10 "+amount/10);
		  amount%=10;
	  }
	  if(amount>=5)
	  {
		  System.out.println("5 "+amount/5);
		  amount%=5;
	  }
	  if(amount>=1)
	  {
		  System.out.println("1 "+amount%10);
	  }
  }
}
