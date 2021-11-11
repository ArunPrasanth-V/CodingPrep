package companyAskedQuestions;
import java.util.*;
public class ComplicatedPalindrome 
{
  static int spoint=0;
  static int epoint=0;
public static void printNumber(int spoint,int epoint)
{
	int count=0;
	for(int i=spoint;i<=epoint;i++)
	    count++;
	System.out.println(count);
}
  public static void main(String args[])
  {
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  String[]s=new String[n];
	  for(int i=0;i<n;i++)
	   s[i]=scan.next();
	  for(int i=0;i<n;i++)
	  {
		  s[i]=s[i].toLowerCase();
		  char[] c=s[i].toCharArray();
		boolean bool= givenCondition(c,0,c.length-1);
	   
	  }
	  
  }
  
  public static boolean isPalindrome(char c[],int start,int end)
  {
	  int temps=start;
	  int tempe=end;
	  for(int i=start;i<=end;i++,end--)
	  {
		  if(c[i]!=c[end])
		  {
			  spoint=start;
			  epoint=end;
			  return false;
		  }
		  
	  }
	  printNumber(temps,tempe);
	  return true;
  }
  
  public static boolean givenCondition(char[]c,int stpoint,int enpoint)
  {//wassamassdaw
	  boolean temp=false;
	  temp=isPalindrome(c,stpoint,enpoint);
        if(temp==true)
	        return true;
        
     return false; 
        	  
	}
}
