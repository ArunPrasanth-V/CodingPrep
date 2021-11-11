package javaCollection;
import java.util.*;
import java.util.function.Predicate;

public class _Predicate {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int  oddarr[]=new int[((b-a)/2)+1];
       int evenarr[]=new int[((b-a)/2)+1];
       int temp1=a;
       int temp2=b;
       int aa=0,bb=0;
       for(int i=a;i<=b;i++)
       {
    	   if(i%2==0)
    	   {
    		   evenarr[aa]=i;
    		   aa++;
    		   
    	   }
    	   else if(i%2!=0)
    	   {
    		   oddarr[bb]=i;
    		   bb++;
    		   
    	   }
       }
       a=temp1;
       b=temp2;
    
       if(a%2==0&&b%2==0 || a%2!=0&&b%2==0)
       {
            aa=evenarr.length-1;
            bb=0;
            int q=-10;
            q=-1*(-10);
            System.out.println(" nvenkenvek"+q);
            float d=a;
            while(true)
            {
            	if(aa>=0&&evenarr[aa]!=0)
            	{
            		System.out.println(evenarr[aa]);
            		aa--;
            	}
            	if(bb<=oddarr.length&&oddarr[bb]!=0)
            	{
            		System.out.println(oddarr[bb]);
            		bb++;
            	}
            	if(aa<0&&b>=oddarr.length)
            		break;
            }
       }
      
       
   }
}
