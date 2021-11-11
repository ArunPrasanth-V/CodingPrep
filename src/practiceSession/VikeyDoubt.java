package practiceSession;



public class VikeyDoubt {
	public static void main(String args[])
	{//any input in two digit it will work
		String s="54:6:30";
		char[] c=s.toCharArray();
	     String ss="";
	     int add1=0, add2=0, did=0,count=0;
	  
		for(int i=0;i<c.length;i++)
		{
			while(c[i]!=':'&&i<c.length-1)
			{
				ss+=c[i];
				i++;
			}
			if(count<2)
			{
				add1+=Integer.parseInt(ss);
			    ss="";
				count++;
			}
			 if(count>2)
			{
				did=Integer.parseInt(ss);
			}
		}
		ss+=c[c.length-1];
		did=Integer.parseInt(ss);
		int temp=(add1+add2)/did;
		
		System.out.println(temp);
	}
	
}
