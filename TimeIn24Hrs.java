package hrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeIn24Hrs {

    static String timeConversion(String s) {
        
    	String ch="",h="",sub="",checkstring="";
        int hour=0,min=0,sec=0;
        checkstring=s.substring(0,s.length()-2);
        String[] check=checkstring.split(":");
        hour=Integer.parseInt(check[0]);
        min=Integer.parseInt(check[1]);
        sec=Integer.parseInt(check[2]);
        
        if((hour>0 && hour<=12)&& (min>=0 && min<=59) && (sec>=0 && sec<=59)) {      
    	if(s.length()==9) {
	         	if(s.charAt(1)==':'){
	    		ch=Character.toString( s.charAt(7));
	    		 h=s.substring(0,1);
	    		 sub=s.substring(1,s.length()-2);
	    		 }
	            else{
	    		 ch=Character.toString( s.charAt(8));
	    		 h=s.substring(0,2);
	    		 sub=s.substring(2,s.length()-2);
	    		 }
    	}
    	
    	else if(s.length()==10) {
    		ch=Character.toString( s.charAt(8));
    		 h=s.substring(0,2);
    		 sub=s.substring(2,s.length()-2);
    	}
    	
       else if(s.length()==8) {
	         	 ch=Character.toString( s.charAt(6));
	    		 h=s.substring(0,1);
	    		 sub=s.substring(1,s.length()-2);
	    		 }
    	
    	
       
    	int hh=Integer.parseInt(h);
       String newh="";
       if(ch.equalsIgnoreCase("p"))
       {
           
           
           if(hh==12) {
           	return hh+sub;
           }
           else {
                hh+=12;
             	 return hh+sub;        
           }
       }
        
       else{
       	
       	if(Integer.parseInt(h)==12)
       	{
       	  return "00"+sub;	
       	}
       	else {
       	 h=s.substring(0,s.length()-2);
            return h;
       	}
       }
        
        }
        
        else
        	return "wrong input";
     }
    	
     
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}