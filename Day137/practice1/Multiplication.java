public class Multiplication {

  public static void main(String[] args) {
    
    int  n=3,m=5;

    System.out.println(multi(n,m));
  }
  public static int multi(int n,int m) {
    if(m==1 || m==0)
      return m;
      return n*multi(n, m-1);
  }
}
