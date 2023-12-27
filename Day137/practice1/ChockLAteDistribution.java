import java.util.Arrays;

public class ChockLAteDistribution {

  public static void main(String[] args) {
    
    int a[] = {7,3,2,4,9,12,56};
    int m =3;
    int min=Integer.MAX_VALUE;
    Arrays.sort(a);

    for(int i=0;i<a.length-m;i++) {
      int diff = a[m+i-1]-a[i];
      min = Math.min(diff,min);
     
    }
    System.out.println(min);
  }
  
}
