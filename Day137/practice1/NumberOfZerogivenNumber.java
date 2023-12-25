public class NumberOfZerogivenNumber {

  public static void main(String[] args) {
    
    int n = 1032000;
    
    System.out.println(countZeros(n));
  }
  public static int countZeros(int n) {
   int rem;
    if(n==0)
    return 0;
     
    else {

      rem = n%10;
      n=n/10;
    }
    if(rem==0)
     return 1+countZeros(n);
    else 
     return countZeros(n) ;

  }
  
}
