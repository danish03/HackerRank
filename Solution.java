package hrank;

	import java.io.*;
	import java.text.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	
	public class Solution {
	
	    static void plusMinus(int[] arr) {
	        int n=arr.length;
	        int pos=0,neg=0,zero=0;    
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]<0)
	                neg++;
	            else if(arr[i]>0)
	                pos++;
	            else
	                zero++;
	            
	        }
	    
	        
	        double postv=(double)pos;
	     double posratio=postv/n;
	     double negtv=(double)neg;
	     double negratio=negtv/n;
	     double zerotv=(double)zero;
	     double zeroratio=zerotv/n;
	     DecimalFormat df=new DecimalFormat(".####");
	     System.out.println(df.format(posratio));
	     System.out.println(df.format(negratio));
	     System.out.println(df.format(zeroratio));
	        
	    }
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        plusMinus(arr);
	        in.close();
	    }
		
		
			
			
		
	}
