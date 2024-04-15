import java.util.Arrays;

public class printArraySubset {

  public static void main(String[] args) {
    
    int a[] = {1,2,3};
    printSubset(a);
    System.out.println(Arrays.toString(a));
   
  }

  public static int[] printSubset(int a[]) {

    if(a.length==0) {
      int a1[] = {0};
     
      return a1;

    }

    int smallArr[] = new int[a.length-1];

    for(int i=0;i<smallArr.length;i++) {

      smallArr[i] = a[i+1];

    }

    int smallans[] = printSubset(smallArr);  
    int ans[] = new int[2*smallans.length];

    int k=0;
    for(int i=0;i<smallans.length;i++) {
      ans[k] = smallans[i];
      k++;
    }

    for(int i=0;i<smallans.length;i++) {
      ans[k] = a[0]+smallans[i];
      k++;
    }

    return ans;
     

    
  }
  
}
