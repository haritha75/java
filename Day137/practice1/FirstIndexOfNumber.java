public class FirstIndexOfNumber {

  public static void main(String[] args) {
    
    int a[] = {9,8,2,8,5};

    System.out.println(firstIndex(a,8,0));
    
  }

  static int firstIndex(int[] input, int x, int startIndex) {

    if(startIndex == input.length) {
      return -1;
    }
      
    if(input[startIndex] == x) {
      return startIndex;
    }  
    return firstIndex(input, x, startIndex+1);
  
  }
  
}
