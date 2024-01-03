public class StairCase {

  public static void main(String[] args) {
    int n = 3;
   System.out.println( stairCase(n));
  }
  public static int stairCase(int n) {
    if(n<0)
      return 0;
      if(n==0)
        return 1;
      return stairCase(n-1)+stairCase(n-2)+stairCase(n-3);  
  }
  
}
