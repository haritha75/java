public class NumberOfDigits {

  public static void main(String[] args) {
    int n = 126;

   System.out.println(countDigits(n));
  }

  static int countDigits(int n) {

    if(n == 0) {
      return 0;
    }
    return 1+countDigits(n/10);
  }
  
}
