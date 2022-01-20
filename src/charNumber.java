public class MyClass {
    public static void main(String args[]) {
	  String str="a00000000b010c0000000";
	  doit(str);
    }
  static String doit(String str)
  {
	  StringBuilder word=new StringBuilder();
	  int length=str.length(), i=0, num=0,index=0;
	  while(i<length)
	  {
		  boolean getindex=true;
		  num=0;
		  index=i-1;
		  while(i<length && str.charAt(i)>='0' && str.charAt(i)<='9' )
		  {
		      if(str.charAt(i)=='0' && getindex)
		      {
		          i++;
			      continue;
		      }
			  num=num*10+Integer.parseInt(str.charAt(i)+"");
			  i++;
		  }
		   while(num-->0)
			   word.append(str.charAt(index));
		  i++;
	  }
	return word.toString();
	  
  }
}
