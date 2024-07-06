public class ZigZagPattern {
  public static void main(String[] args) {
      int n = 5; 
      int h1 = n+2; 
      for (int i = 1; i < n; i++) {
          for (int j = 1; j < i; j++) {
              System.out.print(" ");
          }
          System.out.print("*");

          for (int k = 1; k <= h1; k++) {
              System.out.print(" ");
          }
          System.out.print("*");
          System.out.println();

          h1 -= 2; 
      }

      for (int i = 1; i < n; i++) {
          System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();


      int g = 1; 

      for (int i = 1; i <n; i++) {
          for (int j = 1; j < n - i; j++) {
              System.out.print(" ");
          }
          System.out.print("*");
          for(int k = 1; k <= g; k++) {
            System.out.print(" ");

          }
          System.out.print("*");
          System.out.println();
          g +=2;

    
      }

  }
}