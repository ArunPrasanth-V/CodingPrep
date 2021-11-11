package day2;

public class GiriDoubt
{
      public static void main(String args[])
      {
    	  Sloution call=new Sloution();
    	  String s="abcdcbra";
    	  String mm=call.check(s);
    	  System.out.println(mm);
      }
}
class Sloution
{
	int resultsart;
	int resultLenght;
	public  String check(String s)
	{
		int len=s.length();
		if(len<1)
		{
			return s;
		}
		for(int i=0;i<len;i++)
		{
			ispalin(s,i,i);
			ispalin(s,i,i+1);
		}
		return s.substring(resultsart,resultsart+resultLenght);
		
	}
	private void ispalin(String s, int start,int end)
	{
		while(start>=0 && end<s.length() &&
				s.charAt(start)==s.charAt(end))//
		{
			start--;
			end++;
		}
		start++;
		end--;
		if( resultLenght<end-start)
		{
			resultsart=start;    
			resultLenght=1+(end-start);
		}
	}
}
