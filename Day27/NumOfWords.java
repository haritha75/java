//print how many words in given string.
public class NumOfWords
{
public static void main(String args[])
{
int words=0;
String s1="everyone have their own perspective";
for(var x:s1.toCharArray())//for each loop means it store temparary value once check and again another value store and again check the condition.
{
if(x==' ')
words++;
}
System.out.print(words+1);
}
}
