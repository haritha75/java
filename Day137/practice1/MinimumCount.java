public class MinimumCount {

  public static void main(String[] args) {
    
    int n = 4; //print minimum sqaures required this n = 2^2,2^2,2^2 = 12 so 3 squares required

    System.out.println(minSq(n));
  }

  private static int minSq(int n) {
    if(n==0 ||n==1||n==2||n==3)
      return n;
  

  int ans = Integer.MAX_VALUE;

  for(int i=1;i*i<=n;i++) {
    ans = Math.min(ans, 1+minSq(n-i*i));
  }
  
  return ans;
  }
}
