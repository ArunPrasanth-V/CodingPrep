package day2;

public class StringPatternProgram {
public static void main (String args[])
{
	char[] c1= {'p','r','o','g','r','a','m'};
	char temp[]=new char[c1.length];
	for(int start=0,end=c1.length-1;end>=0;end--,start++)
	{
		temp[start]=c1[start];	
		temp[end]=c1[end];
		for(char c:temp)
	     System.out.print(c);
		temp[start]=0;
		temp[end]=0;
		System.out.println("\n");
	}
}
}
