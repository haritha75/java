import java.util.Scanner;

public class TwoDimentsionalArray {

  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int rows = sc.nextInt();
    int cols= sc.nextInt();
    int a[][] = new int[rows][cols];

    for(int i=0;i<rows;i++) {
      for(int j=0;j<cols;j++) {
        a[i][j]=sc.nextInt();
      }
    }
     for(int i=0;i<rows;i++) {
      for(int j=0;j<cols;j++) {
       System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }

    System.out.println(a); //it return base address
    System.out.println(a[0]); //it return 0th row of base address
    System.out.println(a[1]);
    System.out.println(a[0][1]);
    System.out.println(a.length); //it return no.of rows
    System.out.println(a[0].length); //it return no.of cols

  }
  
}
