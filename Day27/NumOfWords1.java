//if more than one space in string count the numbers of words.
public class NumOfWords1
{
public static void main(String args[])
{
int words=0;
String s1="everyone have their  own  perspective";
 s1=s1.trim().replaceAll("\\s+"," ");
System.out.println(s1);
for(var x:s1.toCharArray())//for each loop means it store temparary value once check and again another value store and again check the condition.
{
System.out.println(x);
if(x==' ')
words++;
}
System.out.print(words+1);
}
}
