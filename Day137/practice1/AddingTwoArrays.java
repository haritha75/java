import java.util.Arrays;

public class AddingTwoArrays {

  public static void main(String[] args) {
    int a[]={2,5,4};
    int b[]={1,5,3};
    int c[]=new int[b.length];
    int i=a.length-1;
    int j=b.length-1;
    int carry =0;
    int z = c.length-1;

    while(i>=0 && j>=0) {
      int sum  = a[i]+b[j]+carry;
      carry = sum/10;
      c[z]= sum %10;
      i--;
      j--;
      z--;

    }
    System.out.println(Arrays.toString(c));
  }
  
}
