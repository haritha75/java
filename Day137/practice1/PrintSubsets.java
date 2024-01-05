public class PrintSubsets {

  public static void main(String[] args) {
    
    int a[] = {1,2,3};

    printSubsets(a);
  }

  private static void printSubsets(int[] a) {
    int output[] = new int[0];
    printsubsetsHelper(a,0,output);
  }

  private static void printsubsetsHelper(int[] a, int start, int[] output) {
    if(start==a.length) {

      for(int i:output) {
        System.out.print(i+" ");
      }
      System.out.println();
      return;
    }

    int newOutput[] = new int[output.length+1];
    int i=0;

    for(;i<output.length;i++) {
      newOutput[i] = output[i];
    }

    newOutput[i] = a[start];

    printsubsetsHelper(a,start+1,output);
    printsubsetsHelper(a,start+1,newOutput);
  }
  
}
