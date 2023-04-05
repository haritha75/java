//print reverse elements in array.


public class EndArray
{
public static void main(String args[])
{
int a[]={14,1,2,5,7,8,0};
endArray(a,a.length-1);
}
static void endArray(int a[],int endInd)
{
if(endInd<0)
return;
System.out.print(a[endInd]+" ");
endArray(a,endInd-1);
return;
}
}
