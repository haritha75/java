//print the lonely element in array
public class LonelyElement
{
public static void main(String args[])
{
int arr[]={3,6,2,1,3,1,2};
for(int i=0;i<arr.length;i++)
{
int count=0;
for(int j=i+1;j<arr.length;j++)
{
if(arr[j]==arr[i]){
count++;
break;
}
}
if(count==0)
{
System.out.print(arr[i]);
return;
}
}

}
}
