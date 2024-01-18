public class SumOfDigits {

  public static void main(String[] args) {
    
    int n = 12345;
    System.out.println(sumOfDigit(n));
  }

  static int sumOfDigit(int input) {

    int sum;

    if(input <  10) 
       return input;
    
    sum  = (input % 10) + sumOfDigit( input / 10);
    
    return sum;
  }
  
}
