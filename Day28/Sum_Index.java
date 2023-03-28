//import java.util.Arrays;
//print the unique elements
public class Sum_Index
{
public static void main(String args[])
{
String str="heeeellokk";
int a[]=new int[128];
for(int i=0;i<str.length();i++)
{
int ind=str.charAt(i);
a[ind]+=1;
System.out.println(ind+" "+a[ind]);
}
int sum=0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];//sum the array values.
}
System.out.println(sum);
int app=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>0)//it means how many  indexes containing more than zero.
app++;
}
System.out.println(app);
System.out.println(str.length()-app);//unique values or char
}
}
