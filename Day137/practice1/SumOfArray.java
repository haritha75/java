public class SumOfArray {

  public static void main(String[] args) {
    
    int a[] = {2,5,6};
    System.out.println(sum(a,0));
  }

  static int sum(int[] input, int startIndex) {

    if(startIndex ==  input.length)  {
        
       return 0;
    }

    return input[startIndex] + sum(input,startIndex+1);
  }
  
}
