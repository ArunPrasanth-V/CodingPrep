package practiceSession;

public class DecimalToBinary {
public static int BinaryToDecimal(int n)
{
	int temp=0;
	char[]t1=(n+"").toCharArray();
	int m=0;
	for(int i=t1.length-1;i>=0;i--)
	{
	   temp+=(t1[i]-48)*(Math.pow(2, m));
	   m++;	
	}
	return temp;
}
	//binary 2 octal-8 decimal-10 hexa-16
public static void main(String args[])
{
	int num=10, temp=0;
    String t1="";
	while(num>1)
	{   
		temp=num%2;
		num/=2;	
		t1=temp+t1;
	}
	t1=num+t1;
	
	System.out.println(t1);
    System.out.println(BinaryToDecimal(Integer.parseInt(t1)));
	
}
}
