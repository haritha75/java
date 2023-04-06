//print the highest  value
public class HighestValues
{
public static void main(String args[])
{
int n=4518;//451 458 418 518
int max=0;
int place=1;
while(n/place>0)
{
int num=n/(place*10)*place+n%place;
if(num>max)
max=num;
place*=10;
}System.out.println(max);
}
}
