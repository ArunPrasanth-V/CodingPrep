package day1;

public class Flames {
	public static void main(String agrs[])
	{
		char[] s1= {'a','r','u','n','p','r','a','s','a','n','t','h'};
		char[] s2= {'u','s','a'};
		char[] flame= {'F','L','A','M','E','S'};
		int totalCount =s1.length+s2.length;
		int temp=0;
		for(int i=0;i<s1.length;i++)
		{
			while(temp<s2.length)
			{
				if(s1[i]==s2[temp])
				{
					totalCount-=2;
				    s2[temp]='-';
				    break;
				}
					temp++;
			}
			temp=0;
		}
		temp=0;
		int count=0;
		int index=0;
		for(int i=0;i<5;i++)
		{//flames
		       while(count<totalCount)
		       {
		    	   if(flame[index%6]!='-')
		    		   count++;
		    	   index++;
		       }
		       count=0;
		       flame[(index-1)%6]='-';
		}	
		
		
		for(int i=0;i<=5;i++)
		{
			if(flame[i]!='-')
				System.out.println(flame[i]);
		}
		
	}

}
