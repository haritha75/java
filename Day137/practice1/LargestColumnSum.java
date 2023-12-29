public class LargestColumnSum {

  public static void main(String[] args) {
    
    int a[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    System.out.println(largest(a));
    System.out.println();

    int maxCol = Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++) {
      int max =0;
      for(int j=0;j<a[0].length;j++) {

        max +=a[j][i];
      }
      if(max>maxCol)
      maxCol = max;
    }

    System.out.println(maxCol);
  }
  public static int largest(int a[][]) {

     int maxCol = Integer.MIN_VALUE;
    for(int i=0;i<a[0].length;i++) {
      int max =0;
      for(int j=0;j<a.length;j++) {

        max +=a[j][i];
      }
      if(max>maxCol)
      maxCol = max;
    }

    return maxCol;
  }
  
}
