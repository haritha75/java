public class MultiplicationOfTwoInteger {

  public static void main(String[] args) {
    
    int  m=3,n=5;

    System.out.println(multiplyTwoInteger(m,n));
  }


  static int multiplyTwoInteger(int m,int n) {
    
    if(m==0 || n==0)
        return 0;

    return m + multiplyTwoInteger(m, n-1);
  }


}
