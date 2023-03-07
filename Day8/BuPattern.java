//program to print numer butterfly
import java.util.*;
public class BuPattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print(" enter the number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=n;j>=n-i+1;j--){
if(j==1)
break;
System.out.print(j);
}
for(int k=1;k<=n-i;k++)
System.out.print(" ");
for(int k=1;k<=n-i-1;k++)
System.out.print(" ");
for(int j=n-i+1;j<=n;j++)
System.out.print(j);
System.out.println();
}

for(int i=1;i<=n;i++){
for(int j=n;j>=i+1;j--)
System.out.print(j);
for(int k=0;k<=i-1;k++)
System.out.print(" ");

for(int k=1;k<=i-1;k++)
System.out.print(" ");
for(int j=i+1;j<=n;j++)
System.out.print(j);

System.out.println();
}
}
}
