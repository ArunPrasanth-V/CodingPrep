package day1;

public class Remove_Unwanted_brackets {

	public static void main(String args[])
	{
		String s="((a)a)(b))";
		char ch[]=s.toCharArray();
		int start=0;
		int open=0,close=0;
		String ss="";
		for(int end=ch.length-1;end>=0;end--,start++)
		{
		
		  if(ch[start]=='(') open++;
		  else if(ch[start]==')')open--;
		  if(ch[start]=='('&&ch[start+1]=='('&&open>1)
		  {  ch[start]=' ';open--;close++;}
		  if(open<0)
		  {
			  ch[start]=' ';
			  open++;
		  }
		  
		  if(ch[end]==')')
		      close++;
		  else if(ch[end]=='(')
			  close--;
		  if(ch[end]==')'&&ch[end-1]==')'&&close>1&&open>=1)
		  {ch[end]=' ';close--;open++;}
		  if(close<0)
		  {
			  ch[end]=' ';
			  close++;
		  }
		}
		
		for(char i:ch)
		{
			if(i!=' ')
				ss+=i;
		}System.out.print(ss);
   }
}