import java.util.Arrays;

public class MaximumProfitOnApp {

  public static void main(String[] args) {
    int a[] = {30,20,53,14};
    Arrays.sort(a);

    int profit = Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++) {

      int temp = a[i]*(a.length-i);

      profit = Math.max(profit, temp);

    }

    System.out.println(profit);
  }
  
}
