package hrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    static void staircase(int n) {
       if(n>0)
       {
           for(int i=0;i<n;i++)
           {
               for(int j=n-1-i;j>0;j--)
               { System.out.print(" "); }
               
               for(int k=0;k<=i;k++)
               { System.out.print("#"); }
               
               System.out.println();
           }
                   
       }
       
       else{
             System.out.print("wrong input");
         } 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
