import java.util.ArrayList;
import java.util.Arrays;

public class BooleanMatrix {

  public static void main(String[] args) {
    
    int a[][] = {
           {1, 0, 0},
           {0, 0, 0},
           {0, 1, 0}
    };


    booleanMatrix(a);
    
  }

  public static void booleanMatrix(int matrix[][])
  {
      // code here 
      
      int rows[] = new int[matrix.length];
      int cols[] = new int[matrix[0].length];
      
      for(int i=0;i<rows.length;i++) {
         for(int j=0;j<cols.length;j++) {
             if(matrix[i][j]==1) {
                 rows[i] = 1;
                 cols[j] = 1;
             }
         }
      }
      
      for(int i=0;i<rows.length;i++) {
          for(int j=0;j<cols.length;j++) {
              if(rows[i] == 1 || cols[j] == 1)
                matrix[i][j] = 1;
          }
      }
      
     for(int x[]:matrix) {
      System.out.println(Arrays.toString(x));
     }
  }
  
}
