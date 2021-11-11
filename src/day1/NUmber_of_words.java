package day1;

public class NUmber_of_words 
{
	public static void main(String args[])
	{
		String s="abcdefgh";
		char []c=s.toCharArray();
	    s="";
	    int count=0,start=0;
		for(int traverse=0;traverse<c.length;traverse++)
		{
		    if(c[traverse]==c[start])
		    	count++;
		    else if(c[traverse]!=c[start])
		    {
		    	s=s+c[start]+count;
		        start=traverse;
		        count=1;
		    }
		}
		s=s+c[start]+count;
		System.out.println(s);
	}
}
