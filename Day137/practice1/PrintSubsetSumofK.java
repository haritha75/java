public class PrintSubsetSumofK {

  public static void main(String[] args) {
    
    int a[] = {5,1,2,6,7,4,3};
    int k =9;
    printSubsetOfSum(a,k);
  }

  private static void printSubsetOfSum(int[] a, int k) {

    int output[] = new int[0];
    printSubsetOfSum(a,0,output,k);
  }

  private static void printSubsetOfSum(int[] a, int start, int[] output, int k) {

    if(start==a.length) {
      if(k==0) {
        for(int i:output) {
          System.out.print(i+" ");
        }
        System.out.println();
        return;
      }
      else{
        return;
      }
    }
      int newOutput[] =new int[output.length+1];
      int i=0;
      for(;i<output.length;i++) {
        newOutput[i]=output[i]; //here first we are copying the output values
      }
      newOutput[i]=a[start]; //next we are copying start index value
      printSubsetOfSum(a,start+1,output,k);
      printSubsetOfSum(a,start+1,newOutput,k-a[start]);



  }
  
}
