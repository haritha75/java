import java.util.Scanner;

public class FunctionWith2DArray {

   static Scanner sc =new Scanner(System.in);
  public static void main(String[] args) {
    
   int a[][] = takeInput();
   printArray(a);

  }

  public static void printArray(int a[][]) {
    
    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a[0].length;j++) {
       System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static int[][] takeInput() {

    int rows = sc.nextInt();
    int cols= sc.nextInt();
    int a[][] = new int[rows][cols];

    for(int i=0;i<rows;i++) {
      for(int j=0;j<cols;j++) {
        a[i][j]=sc.nextInt();
      }
    }
    return a;
  }
  
}
