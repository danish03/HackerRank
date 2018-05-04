package hrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    static void miniMaxSum(int[] arr) {
       long minsum=0L,maxsum=0L;
        int temp=0;
        int n=arr.length;
       /* for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else
                { continue;}
            }
        }
        */
        Arrays.sort(arr);
          /*for(int i=0;i<n;i++)
          {System.out.print(arr[i]+" ");}*/
          
          for(int i=0;i<n;i++) {
        	  
        	  if(i==0) {
        		  minsum+=arr[i];
        	  }
        	  else if(i>0 && i<n-1) {
        		  maxsum+=arr[i];
        		  minsum+=arr[i];
        	  }
        	  else
        	  {
        		  maxsum+=arr[i];
        	  }
          }
          
          System.out.print(minsum+" " +maxsum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
