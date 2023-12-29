import java.util.Arrays;

public class NextPermutaionEx {
  public static void main(String[] args) {

    int a[] = {3,2,1};

    nextPermutation(a);
   

  }
  public static void nextPermutation(int[] a) {

     int n = a.length-2;

    int i;

    for (i=n;i>=0;i--) {
      if(a[i] <=a[i+1]) {
        break;
      }
     i--;
    }

    if(i>=0) {

      int j=a.length-1;
      if(a[j]>=a[i]) 
        swap(a,i,j);
       reverse(a,i+1); 
    }
    else {

      reverse(a,0);
    }
    System.out.println(Arrays.toString(a));

  }
  public static void swap(int a[],int i,int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
  public static void reverse(int a[],int start) {
    int end = a.length-1;
    while(start<end) {
        swap(a,start,end);
        start++;
        end--;
    }
}

}
