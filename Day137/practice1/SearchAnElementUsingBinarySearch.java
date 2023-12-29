public class SearchAnElementUsingBinarySearch {

  public static void main(String[] args) {
    
    int a[] ={5,6,7,8,1,2,3,4};
    int pivotIndex = findPuvotIndex(a);
    int target = 4;

    if(pivotIndex==-1)
       System.out.println(binarySearchMethod(a, target,0,a.length));
    else {

      if(a[0]<=target)
         System.out.println(binarySearchMethod(a, target, 0, pivotIndex));
      else
      
        System.out.println(binarySearchMethod(a, target, pivotIndex+1, a.length));

    }



  }
  public static int findPuvotIndex(int a[]) {

    for(int i=0;i<a.length-1;i++) {
      if(a[i]>a[i+1])
        return i;
        
    }

    return -1;
  }
  public static int binarySearchMethod(int a[],int target,int low,int high) {


    while(low<=high) {
      int mid = (low+high)/2;
      if(a[mid]==target)
        return mid;
      else if(a[mid]<target)
        low = mid+1;
      else
        high = mid-1;    

    }
    return -1;
  }
  
}
