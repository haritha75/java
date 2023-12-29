public class RowWiseSum {

  public static void main(String[] args) {
    

    int a[][] = {
      {1,2,3},
      {4,5,6}
    };

    System.out.println(largestRowSum(a));

    int rowSum =0;

    for(int i=0;i<a.length;i++) {

      for(int j=0;j<a[0].length;j++) {
        rowSum += a[i][j];
      }
      
      System.out.print(rowSum+" ");
      rowSum =0;

    }
  }
  public static int largestRowSum(int a[][]) {

  
    int max =Integer.MIN_VALUE;
 

    for(int i=0;i<a.length;i++) {
          int rowSum =0;
      for(int j=0;j<a[0].length;j++) {
        rowSum += a[i][j];
      }
      
      if(rowSum>max)
       max = rowSum;

  }
       return max;
  }

  
}
