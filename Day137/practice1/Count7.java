public class Count7 {

  public static void main(String[] args) {
    
    int num = 742765;
    System.out.println(count7(num));

  }
  public static int count7(int n) {
    if(n == 0)
      return 0;

    int rem = n%10;

    if(rem == 7)
      return 1 + count7(n/10);  
    return 0 + count7(n/10);
   }
  
}
