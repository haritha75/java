//print given string numbers wise like this f4
public class StrNum
{
public static void main(String args[])
{
String s1="ffffeertyyyybcgfxxxx";
String res="";
for(int i=0;i<s1.length();)
{
int c=0,j;
for(j=i;j<s1.length();j++)
{
if(s1.charAt(i)==s1.charAt(j))
c++;
else
break;
}
if(c==1)
res+=s1.charAt(i);
else
res+=s1.charAt(i)+Integer.toString(c);
System.out.println(j);
i=j;//i will be 4 in first condition and if your i++ in for then i will be 4+1=5.
//System.out.println(i);
}
System.out.println(res);
}
}

