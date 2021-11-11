package practiceSession;
import java.util.*;
public class ThinkingProgram
{
	static int num=0;
	static int num1=0;
public static void print(int start,int end)
{
		int co=0;
		 for(int ii=start;ii<=end;ii++)
			   co++;
		  System.out.println(co);
}
public static boolean check(char c[],int start,int end)
{
	         boolean bool=false;
	         System.out.println(start +" "+end);
	         bool=subString(c,start,end);
	         if(bool==true)
	         {//wassamassdaw
	        	 return false;
	         }
	         else
	         { 
	        	 end=num;
	        	 num=0;
	        	 //System.out.println(end);
	        	 bool=check(c,start,end);
	        	 if(bool==true) {
	        		 return false;}
	        	 else {
	        		 bool=check(c,start++,end);
	        		 start=num1;
	        		 num1=0;}
	         }
	         return false;
}		
public static void main(String args[])
{
	 Scanner scan=new Scanner(System.in);
//	  int n=scan.nextInt();
//	  int count=0;
//	  boolean bool=false;
//	  String s[]=new String[n];
//	  for(int i=0;i<n;i++)
//	  {
//		  s[i]=scan.next();  
//	  }
//	  for(int i=0;i<n;i++)
//	  {
//	    count=0;
//	    char[]c=s[i].toCharArray();	
//	    check(c,0,c.length-1);
//	  }	
	 String s="wassamassdaw";
	 char c[]=s.toCharArray();
	 check(c,0,c.length-1);
	 
}
public static boolean subString(char c[],int start,int end)
 {
	  int temp=start;
	  int t1=end;
	  for(int i=temp;i<=t1;i++)
	  {
		 System.out.println(c[temp]+" "+c[t1]);
		  if(c[temp]!=c[t1])
		  {
			  num1=temp;
			  num=t1;
			  System.out.println("afr");
			  return false;
		  }
		  temp++;t1--;
	  }
	  System.out.println(t1);
	  print(start,end);
	  return true;
 }

}