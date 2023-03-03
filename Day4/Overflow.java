//write a program on Overflow in java
//overflow occurs when we assign such a value to a variable which is more than the maximum permissible value that time it happens.
public class Overflow
{
public static void main(String args[])
{
short a=32767;
a++;
System.out.println(++a);
}
}
