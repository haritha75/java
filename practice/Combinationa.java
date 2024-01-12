public class Combinationa {

  public static void main(String[] args) {
    
    int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    
    possibleComb(a);
    System.out.println();
   
  }

  private static void possibleComb(int[] a) {

   for(int j=a.length-1;j>=0;j--) {
    for(int i=0;i<a.length;i++){
      if(i!=j) {
        System.out.print(a[i]+" ");
      }
      
    }
    System.out.println();
    }
  } 
  

  } 
  

