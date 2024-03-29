//We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

public class Count_Pairs
{
public static void main(String args[])
{
String str="axbx";
int res=countPairs(str);
System.out.print(res);
}
static int countPairs(String str)
{
if(str.length()<=2)
return 0;
if(str.charAt(0)==str.charAt(2))
return 1+countPairs(str.substring(1));
return countPairs(str.substring(1));
}
}

