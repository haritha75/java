import java.util.Arrays;

public class reverseTheArrayUsingRecursion {

  public static void main(String[] args) {
    
    int a[] = {2,4,6,7,5};

    reverArray(a, 0, a.length-1);
    System.out.println(Arrays.toString(a));
  }

  public static void reverArray(int a[],int start,int end) {

    if(start>=end) 
      return;

     int temp = a[start];
     a[start] =a[end];
     a[end]=temp;
     
     reverArray(a, start+1, end-1);
     
      
  }
  
}
