import java.util.Arrays;

public class Combinations {
  public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    int n = 12;
    int data[] = new int[n];
    int i = 0;
    int j = 0;
    while (i >= 0) {
      if (j == a.length) {
        i--;
        if (i >= 0) {
          j = data[i] + 1;
        }
      } else {
        data[i] = j;
        if (i == n - 1) {
          for (int k = 0; k < n; k++) {
            System.out.print(a[data[k]] + " ");
          }
          System.out.println();
          j++;
        } else {
          i++;
          j = data[i - 1] + 1;
        }
      }
    }
  }
}
