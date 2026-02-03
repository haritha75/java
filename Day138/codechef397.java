/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int c;
	    for(int i=0;i<n;i++){
	        c=0;
	        int a=s.nextInt();
	        int b[]=new int[a];
	        for(int j=0;j<a;j++){
	            b[j]=s.nextInt();
	        }
	        for(int j=0;j<a;j++){
	            if(b[j]>=1000)
	            c++;
	        }
	        System.out.println(c);
	    }
		// your code goes here
	}
}
