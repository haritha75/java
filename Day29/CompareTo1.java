//write a program on compare to string function.
public class CompareTo1
{
public static void main(String args[])
{
String s1="haritha";
String s2="iharitha";//111-104=3(i-h=3)
int res=s2.compareTo(s1);//s1.compareTo(s2);it will check first proper substring or not if not then it check  ascill code and return difference b/w both of them in first letter.  
System.out.println(res);
}

}
