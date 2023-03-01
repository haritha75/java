public class LogicalOperators
{
public static void main(String args[])
{
int a=10;
int b=25;
int c=40;
//And operator.if both condition satisfied it will return true otherwise false
System.out.println((a<b)&&(c>a));//return true
System.out.println((a<b)&&(b>c));//return true
//Or operator.alteast one condition satisfied it will return true otherwise false
System.out.println((a<b)||(c>a));//return true
System.out.println((b<a)&&(c>a));//return false
//Not operator.if condition is satisfied return true otherwise false
System.out.println(!(a==b));//return true
System.out.println(!(a<c));//return false
}
}
