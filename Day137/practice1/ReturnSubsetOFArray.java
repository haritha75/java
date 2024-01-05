import java.util.Arrays;

public class ReturnSubsetOFArray {

  public static void main(String[] args) {
    

    int a[] ={15,20,12};

    int anw[][] = subsets(a);

    
    for(int i=0;i<anw.length;i++) {
      System.out.println(Arrays.toString(anw[i]));
    }
  }

  public static int[][] subsets(int a[]) {
    return findSubsets(a,0);
  }

  private static int[][]  findSubsets(int a[],int start) {

    if(a.length==start) {
      int ans[][] = new int[1][0]; 
      return ans;
    }

    

    int smallans[][] = findSubsets(a,start+1);
    int ans[][] = new int[2*smallans.length][];

    int k=0;
    for(int i=0;i<smallans.length;i++) {

      ans[k] = new int[smallans[i].length];
      for(int j=0;j<smallans[i].length;j++) {
        ans[k][j]=smallans[i][j];
      }
      
      k++;
    }

    for(int i=0;i<smallans.length;i++) {

      ans[k] = new int[smallans[i].length+1];
      ans[k][0] = a[start];
      for(int j=1;j<=smallans[i].length;j++) {
        ans[k][j]=smallans[i][j-1];
      
    }
    k++; 
      
  }
   return ans;
  
  }
}
