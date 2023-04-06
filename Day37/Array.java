//given number n,put all elements from 1 to n in an array in order 1,3,....4,2 like this 
 //1 3 5 7 9 8 6 4 2
 import java.util.Arrays;
 public class Array
 {
 public static void main(String args[])
 {
 int n=9;
 int a[]=new int[n];
int start=1;
int i;
for(i=0;i<n/2;i++)
{
a[i]=start;
start+=2;
}
a[i]=n;
if(n%2==0)
start=n-2;
else
start=n-1;

for(int j=i+1;j<n;j++)
{
a[j]=start;
start-=2;
}
System.out.println(Arrays.toString(a));
}
}
