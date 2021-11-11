package practiceSession;

import java.util.Random;
import java.util.Scanner;

public class Practice_2 extends Thread{
	static Practice_2 obj=new Practice_2();
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println("Hello");
		//try {Thread.sleep(1000);}catch(Exception e) {}
	}
  public static void main(String args[])
  {
	  obj.start();//starts the new thread
	  
	
	System.out.println(); 
  }
  
}

