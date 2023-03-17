//write a program on pass by reference
import java.util.Arrays;
public class ReferenceType
{
public static void main(String args[])
{
int arr[]={3,5,8,1,4};//non-primitive type
System.out.println(Arrays.toString(arr));
Ref(arr);
System.out.println(Arrays.toString(arr));
}
static void Ref(int arr1[])//local varible first preference
{
arr1[2]=6;
System.out.println(Arrays.toString(arr1));
}
}
