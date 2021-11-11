package day1;

public class ThreeFourExtract {
    public static void main(String args[])
    {
   String s1="a121234n@2"; 
   String s2="1234";
   char string1[]=s1.toCharArray();
   char string2[]=s2.toCharArray();
   int count=0;
   int temp=0;
   String s="Not Found";
	   for(int i=0,t=0;i<string1.length;i++)
	   {
		  if(string1[i]==string2[t]&&i<string1.length)
		  {
			  temp=i;
			  while(string1[i]==string2[t]&&i<string1.length
					  &&t<string2.length) 
			  {
				  count++;    
				  i++;
				  t++;
				  if(count==string2.length)
				  {
					  s="index is : "+temp;
				       break;
				  }
				  //gbbSystem.out.println(i);
			  }
			  i--;
			  t=0;
			  temp=0;
			  
			 
		  }
		  
	   }
	   System.out.println(s);
    }	
}
