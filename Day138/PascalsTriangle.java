public class PascalsTriangle {
  public static void printPascalTriangle(int n)
  {
      for (int k = 1; k <= n; k++) {
          for (int j = 0; j <= n - k; j++) {

              System.out.print(" "); //for spaces 
          }

          int c = 1;
          for (int i = 1; i <= k; i++) { //how many time we have to print after spaces

              System.out.print(c + " "); 
              c = c * (k - i) / i; //previousvalue*(currentrow-currentcoloumn)/currentcoloumn
          }
          System.out.println();
      }
  }

  public static void main(String[] args)
  {
      int n = 5;
      printPascalTriangle(n);
  }
  
  
}