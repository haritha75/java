public class SpiralPrint {

  public static void main(String[] args) {
    
    int a[][] = {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}
    };
    
    for(int j=0;j<a[0].length;j++)
            System.out.print(a[0][j]+" ");
    
    for(int i=1;i<a.length;i++) {
      System.out.print(a[i][a[0].length-1]+" ");
    }
    for(int j=a.length-2;j >=0;j--) {
      System.out.print(a[a.length-1][j]+" ");
    }
    for(int j=a.length-2;j>=1;j--) {
      System.out.print(a[j][0]+" ");
    }
  }
  
}
