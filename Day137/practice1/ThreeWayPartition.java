import java.util.Arrays;

public class ThreeWayPartition {

  public static void main(String[] args) {
    
    //int a[] = {1,14,5,20,4,2,54,20,87,98,3,1,32};
   // int a[] = {2,5,6,7,1,3,8};
    int a[] = {3,6,1,5,9};
    int low=3,high=5;
    int start =0,end= a.length-1;

   for(int i=0;i<=end;) {

    if(a[i]<low) {
     int temp = a[start];
     a[start] = a[i];
     a[i]=temp;
     start++;
     i++;
    }
    else if(a[i]>high) {
      int temp = a[end];
      a[end] = a[i];
      a[i]=temp;
      end--;

    }
    else{
      i++;
    }
   }

   System.out.println(Arrays.toString(a));

  }
}
