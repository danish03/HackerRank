package hrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NimGame {

    static String winner(int[] A) {
    	int n=A.length,count=0;
    	int flag=0;
    	Arrays.sort(A);
    	  int num=A[0];
    	  for(int j=0;j<n-1;j++)
  		{
  			if(num==A[j+1])
  			{
  				flag=1;
  			}
  			
  			else 
  			{
  				flag=0;
  				break;
  			}
  		} 
    	  
    	 
    	  
      for(int i=0;i<n;i++) {
    	  int a=A[i];
        	while(a>0)
        	{	
        		if(a>13 && a-13>=0)
        			{
        			  a=a-13;
        			  count++;
        			}
        		else if(a>=11 && a<13 && a-11>=0)
    			{
    			  a=a-11;
    			  count++;
    			}
        		else if(a>=7 &&a<11 && a-7>=0)
    			{
    			  a=a-7;
    			  count++;
    			}
        		else if(a>=5 && a<7 && a-5>=0)
    			{
    			  a=a-5;
    			  count++;
    			}
        		else if(a>=3 && a<5 && a-3>=0)
    			{
    			  a=a-3;
    			  count++;
    			}
        		
        		else if(a==2)
    			{
    			  a=a-2;
    			  count++;
    			}
        		else 
        			break;
        	}
        	
        	
        	}
      
        	           	
    	if(flag==1 || count%2==0)
		{ return "Sandy";}
    	
    	else
    	{return "Manasa";}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] A = new int[n];
            for(int A_i = 0; A_i < n; A_i++){
                A[A_i] = in.nextInt();
            }
            
            if((t>=1 && t<=10) && (n>=1 && n<=10000) && (A.length>=1 && A.length<=Math.pow(10,18))) {
            String result = winner(A);
            System.out.println(result);
            }
            
            else
            	System.out.println("wrong input");
        }
        in.close();
    }
}
