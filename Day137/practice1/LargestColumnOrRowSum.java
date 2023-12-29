public class LargestColumnOrRowSum {

  public static void main(String[] args) {
    
    int a[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
   System.out.println( largestSumColOrRow(a));
  }
  public static int largestSumColOrRow(int a[][]) {

    int rowMax=Integer.MIN_VALUE;
    int colMax = Integer.MIN_VALUE;

    for(int i=0;i<a.length;i++) {
      int rowSum =0;
      int colSum =0;
    for(int j=0;j<a[0].length;j++) {
       rowSum += a[i][j];
       colSum +=a[j][i];
    }
    if(rowSum>rowMax)
       rowMax = rowSum;
    if(colSum>colMax)
       colMax = colSum;   
}

if(rowMax>colMax)
   return rowMax;
return colMax;   

 }
 
}
