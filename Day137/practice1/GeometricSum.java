public class GeometricSum {

  public static void main(String[] args) {
    int n = 3;

    System.out.println(sum(n));
  }
  public static double sum(int n) {

    if(n==0)
      return 1;
     
    return 1/Math.pow(2,n)+sum(n-1);  
  }
}
