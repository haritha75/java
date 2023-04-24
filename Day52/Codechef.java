 /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String s=sc.next();
		    String s1=sc.next();
		    for(int k=0;k<s.length();k++){
		        for(int j=0;j<s1.length();j++){
		            if(s.charAt(k)==(s1.charAt(j))){
		                System.out.println(s.charAt(k));
		                return;
		            }
		        }
		    }
		}
	}
}
 
