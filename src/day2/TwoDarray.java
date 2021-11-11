package day2;

public class TwoDarray {
    public static void main(String args[])
    {
    	int ii=0;
      String s="WELCOMETOZOHOCORPORATION";
      s=s.toLowerCase();
      int tt=0;
      char[] cc= {'t','o','o'};
      char[][] c=new char[5][(s.length())/5+1];
      try {
       for(int i=0;i<5;i++)
       {
    	   for(int j=0;j<5;j++)
    	   {
    		   if(tt!=s.length())
    		   {
    	         c[i][j]=s.charAt(tt);
    	         tt++; 
    		   }   		
    		   else
    			   c[i][j]=' ';
    			 
    		}
      }
      
       int temp=0;
       for(int i=0;i<5;i++)
       {
    	   for(int j=0;j<5;j++)
    	   {
   			
	    	   if(c[i][j]==cc[temp])
	    	   {
	    		    ii=i;
	    		  ii++;
	    		  temp++;
	    		while(temp<cc.length)
	    		{
	    			if(c[ii][j]==cc[temp])
	    			{ ii++;
		    		  temp++;
	    			}
	    		}
	    	   }
	    		if(temp==cc.length)
	    		{ii--;
	    	System.out.println("Starting index : "+i+" "+j);
	    	System.out.println("Ending index : "+ii+" "+j);
	    	       break;
	    		}
	    			    		 
	    	   
    	   }
       }
       
      }
      catch(Exception e)
      {
          // System.out.println("somethin wrong");    	  
      }
    }
}
