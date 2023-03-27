//how to swap two string without using third variable
public class Swap_TwoStr
{
public static void main(String args[])
{
String s1="yerukondu";
String s2="haritha";
s1=s1.concat(s2);
System.out.println(s1);
s2=s1.substring(0,s1.length()-s2.length());//it returns given index and also return mention how many letters do you want.
s1=s1.substring(s2.length());//here, it will return 9th index to end
System.out.println(s1);
System.out.println(s2);
}
}
