//print the missing value in array
public class MissingValue1
{
public static void main(String args[])
{
int n=7;
int arr[]={2,7,4,3,1,6};
int t=n*(n+1)/2;
int act=0;
for(int i=0;i<n-1;i++)
act += arr[i];
System.out.print(t-act);
}
}

