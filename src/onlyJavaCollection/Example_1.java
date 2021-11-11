package onlyJavaCollection;
import java.util.*;
public class Example_1 //extends ArrayList<String>
{
static List<Example_1> studentDetails=new ArrayList<>();
	static Scanner scan=new Scanner(System.in);
	private String name,number,address;
	Example_1(String name,String number,String address)
	{
		this.name=name;
		this.number=number;
		this.address=address;
	}
	public String toString()
	{
		return name+" "+number+" "+address;
	}
   public static void main(String args[])
   {
	   boolean bool=true;
	   studentDetails.add(new Example_1("Arun","123","canada"));
	   studentDetails.add(new Example_1("kishore","723","usa"));
	   studentDetails.add(new Example_1("vimal","856","uk"));
	   studentDetails.add(new Example_1("mithin","1346","japan"));
	  
	   info();
	   while(true)
	   {
	   System.out.println("Do You Want to Continue !");
	   int aa=scan.nextInt();
	   if(aa==1)
		   info();
	   else
		   return;
	   }
   }
   public static void info()
   {
     System.out.println("Enter Your Choice \n"
				  		+ "1) Insert\n"
				  		+ "2) inser at specfic index \n"
				  		+ "3) Delte \n"
				  		+ "4) Get Specific Record\n"
				  		+ "5) print");
				  int a=scan.nextInt();
			  if(a==1)
			  {
				  System.out.println("Enter how many data You want to insert \n");
				  int n=scan.nextInt();
				  insert(n);
				 
			  }
			  else if(a==2)
			  {
				  System.out.println("The List Size is these  : "+studentDetails.size());
				  System.out.println("Enter the index You want to insert");
				  int in=scan.nextInt();
				  insertAt(in);
			  }
			  else if(a==3)
			  {
				  System.out.println("The List Size is these  : "+studentDetails.size());
                  System.out.println("Delete element plz");
                  int in=scan.nextInt();
				  delete(in);
			  }
			  else if(a==4)
			  {
				  System.out.println("The List Size is these  : "+studentDetails.size());
				  System.out.println("Featch index Plz ");
                  int in=scan.nextInt();
                  specficRecord(in);
			  }
			  else 
			  {
				  print();
				  
			  }
			   
   }
   public static void specficRecord(int n)
   {
	   System.out.println(studentDetails.get(n));
   }
   public static void insert(int n )
   {
	   String sname;
	   String snumber;
	   String sadd;
	   
	   for(int i=0;i<n;i++)
	   {
		   System.out.println("Enter Your name");
		   sname=scan.next();
		   System.out.println("Enter your Number");
		   snumber=scan.next();
		   System.out.println("Enter Your Address");
		   sadd=scan.next();
		   studentDetails.add(new Example_1(sname,snumber,sadd));
	   }
	   System.out.println("Updated Successfully");
   }
   public static void insertAt(int index)
   {
	   String sname;
	   String snumber;
	   String sadd;
	   studentDetails.add(studentDetails.get(index));
	   System.out.println("Enter Your name");
	   sname=scan.next();
	   System.out.println("Enter your Number");
	   snumber=scan.next();
	   System.out.println("Enter Your Address");
	   sadd=scan.next();
	   studentDetails.set(index,new Example_1(sname,snumber,sadd));
	  // studentDetails.set(index, element)
   }
   
   public static void print()
   {
	   for(Example_1 call:studentDetails)
		  {
			  System.out.println(call);
		  }
   }
   public static void delete(int index)
   {
	   studentDetails.remove(index);
   }
}
