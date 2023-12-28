public class SearchAnElementRoatedSortedArray {

  public static void main(String[] args) {
    int a[] = {5,6,7,8,9,10,1,2,3};
    System.out.println(search(a, 2));
  }


  static int search(int array[], int target)
	{
	    // code here
	    int n = array.length;
	    int low = 0;
	    int high = n-1;
	    
	    while(low<=high) {
	        
	        int mid = (low+high)/2;
	        
	        if(array[mid] == target)
	           return mid;
	        if(array[low] <= array[mid]) {
	            if(target >= array[low] && target <= array[mid])
	               high = mid-1;
	            else
	               low = mid+1;
	        }
	        else {
	            
	            if(array[mid] <= target && target <= array[high])
	              low = mid+1;
	            else
	              high = mid-1;
	        }
	    }
	    return -1;
	}
} 

  

