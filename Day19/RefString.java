//write a program on pass by reference using string function.
public class RefString
{
public static void main(String args[])
{
String name="haritha";//string is immutable it cannot changed.
String name1=name;
String name2="hari";//in java each char store 16 bits using utf(unicode transformation format) form not ascill code type.                                                                                                                                                                                                                                    
System.out.println(name.charAt(2));
System.out.println(name1.charAt(1));
System.out.println(name2.charAt(0));
System.out.println(name.hashCode());
System.out.println(name1.hashCode());//same address because we assign name=name1.it check first.if already have the assign value it return same string and address.
System.out.println(name2.hashCode());
}
}
