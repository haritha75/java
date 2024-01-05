public class BinarySearchRecursive {

  public static void main(String[] args) {
    
    int a[] = {2,5,6,7,9};
    System.out.println(binarySearch(a,5));
  }

  private static int binarySearch(int[] a, int element) {
    return binarySearch(a,0,a.length-1,element);
  }

  private static int binarySearch(int[] a, int start, int end, int element) {
   if(start>end) 
     return -1;

   int mid = (start+end)/2;
   
   if(a[mid]==element)
     return start;
    else if(a[mid]>element)  {
      return binarySearch(a,start,mid-1,element);

    }

    else {

      return binarySearch(a,mid+1,end,element);
    }
  }
  
}
