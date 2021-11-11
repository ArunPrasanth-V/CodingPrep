package equating;

public class Exmaple_1 {
	public static void main(String[] args) {

		  String ss="10:00 9:03 10:00 11:00 10:00";
		  String s="";
		  int count=0;
		  double d=0;
		  char []c=ss.toCharArray();
		  for(int i=0;i<c.length;i++)
		  {
		      if(c[i]!=' '&&c[i]!=':')
		      {
		          s+=c[i];
		      }
		      else if(c[i]==':')
		      {
		          s+=".";
		      }
		     else
		     {
		        d=Double.parseDouble(s);
		        if(d>10.00)
		           count++;
		           d=0;
		        s="";
		     }
		  }
		  d=Double.parseDouble(s);
	        if(d>10.00)
	           count++;
	           d=0;
	        s="";
		  System.out.println(count);
		}
}
