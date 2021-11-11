package RailwayReservationSystem;

import java.util.Scanner;

public class Module1_Booking {
	static  Scanner scanner=new Scanner(System.in);   
	static Train train=new Train();
	   public static void main(String[] args) {

		   System.out.println("enter your choice\n"
		   		+ "1) bookTicket\n"
		   		+ "2) cancelTicket\n"
		   		+ "3) displayAllTickets\n"
		   		+ "4) Exit");
		   boolean end=false;

		    while(!end) {
		    	int choice=scanner.nextInt();
		    	switch(choice) {
		    	case 1:
		    		   train.bookTicket(generateTicket());	
		    		  break;

		    	case 2: train.cancelTicket(generateTicket());
		    	        break;

		    	case 3:train.displayAllTickets();
		    	       break;

		    	case 4:end=true;
		    	       break;

		    	}

		    }
	   }
	//   public static void display() {
//		   train.displayTicket();
	//   }




	   public static Ticket generateTicket() {
		   System.out.println("name");
		   String name=scanner.next();
		   System.out.println("age");
		   int age=scanner.nextInt();
		   System.out.println("gender");
		   String gender=scanner.next();
		   System.out.println("birth preference");
		   String berthpref=scanner.next();
		    return new Ticket(name,age,gender,berthpref);

	   }
	}
