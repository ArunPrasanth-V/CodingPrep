package companyAskedQuestions;

public class Example {
	
   public static void main(String args[])
   {
	   palindrome call=new palindrome();
	   String s=call.check("ava");
	   System.out.println(s);
   }
 
}  
class palindrome
{
	int resultStart=0;
	int resultLength=0;
	public String check(String s)
	{
		int slength=s.length();
		if(slength<2)
		{
			return s;
		}
		for(int start=0;start<slength-1;start++)
		{
			expandRange(s,start,start);
			expandRange(s,start,start+1);//hello
		}
		return s.substring(resultStart,resultStart+resultLength);
	}
private void expandRange(String s,int begin,int end)
  {
		while(begin>=0 && end<s.length()&&
			    s.charAt(begin)==s.charAt(end)	)
		{
			begin--;
			end++;
		}
		if(resultLength<=end-begin-1)//1-1-1=-1
		{
			resultStart=begin+1;
			resultLength=end-begin-1;
		}
	}
}
