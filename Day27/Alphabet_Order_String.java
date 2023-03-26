//print the given string alphabet order
import java.util.Arrays;
public class Alphabet_Order_String
{
public static void main(String args[])
{
String s1="rock";
char temp;
char s2[]=s1.toCharArray();//{'r','o','c','k'}
int n=s2.length;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(s2[i]>s2[j])
{
   temp=s2[i];
   s2[i]=s2[j];
   s2[j]= temp;
   }
   }
   }
   System.out.print(Arrays.toString(s2));
   //System.out.print(String(s2));
   
   }
   }
