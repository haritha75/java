public class CheckNumber {

  public static void main(String[] args) {
    
    int a[] = {2,9,8};

    System.out.println(checkNumber(a,0,8));
  }

  static int checkNumber(int[] input,int startIndex,int x) {

    if(startIndex ==  input.length) {
        return 0;
    }
    if(input[startIndex] == x)
       return startIndex;

    return checkNumber(input, startIndex+1, x);    
   
  }
  
}
