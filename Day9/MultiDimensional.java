//write the code for multi dimension array
public class MultiDimensional
{
public static void main(String args[])
{
int arr[][][]={
          {{3,8,32,54},{7, 96,},{88,45, 74},{24,54,61,53}},
          {{6,9,2,4},{7,22,9,},{8,45, 4},{2,5,1,53}}
          };


for(int u[][]:arr)
{
for(int y[]:u)
{
for(int k:y)
System.out.print(k+" ");
System.out.println();
}
}
}
}


