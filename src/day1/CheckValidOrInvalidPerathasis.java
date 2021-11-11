package day1;

public class CheckValidOrInvalidPerathasis {
   public static void main(String args[])
   {
	  String s="((-ab)+(a+b))";
	   char ch[]=s.toCharArray();
	   int open=0,close=0;
	   for(int start=0,end=ch.length-1;end>=0;end--,start++)
	   {
		   if(ch[0]=='%'||ch[0]=='^'||
			  ch[0]=='&'||ch[0]=='*'||
			  ch[0]=='+'||ch[0]=='-'||
			  ch[0]=='/'||ch[ch.length-1]=='%'
			  ||ch[ch.length-1]=='^'||
			  ch[ch.length-1]=='&'||ch[ch.length-1]=='*'||
			  ch[ch.length-1]=='+'||ch[ch.length-1]=='-'||
			  ch[ch.length-1]=='/')
		        {  
				   System.out.println("11Invalid");
				   break;
			    }
		  
		   if(start>0&&ch[start-1]==')'
				   &&start<ch.length-1
				   &&ch[start+1]=='('
				   )continue;
		   if((ch[start]=='%'||ch[start]=='^'||
			  ch[start]=='&'||ch[start]=='*'||
			  ch[start]=='+'||ch[start]=='-'||
			  ch[start]=='/')
				   &&start<ch.length-1
				   &&ch[start+1]==')')
		    {  
			   System.out.println("11Invalid");
			   break;
		    }
		   else if(ch[start]=='(')open++;
		   else if(ch[start]==')')open--;
		   if(open<0) {
			   System.out.println("Invalid");
			   break;}
		   
		   if(ch[end]=='%'||ch[end]=='^'||
			  ch[end]=='&'||ch[end]=='*'||
		      ch[end]=='-'||ch[end]=='+'&&
		      ch[end-1]=='('&&
		      ( ch[end-1]!=')'&&ch[end+1]!='(')) {
			   System.out.println("Invalid");
			   break;
		   }
		   else if(ch[end]==')')
			   close++;
		   else if(ch[end]=='(')
			   close--;
		   if(close<0)
		   {
			   System.out.println("Invaid");
			   break;
		   }
		   if(start==ch.length-1) {
			   System.out.println("Valid");
		   }
	   }
   }
}
