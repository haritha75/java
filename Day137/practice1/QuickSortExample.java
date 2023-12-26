import java.util.Arrays;

public class QuickSortExample {

  public static void main(String[] args) {
    int a[] = {8,1,4,3,9,2,7};
    quickSort(a,0,a.length-1);
    System.out.println(Arrays.toString(a));
  }
  public static void quickSort(int input[],int start,int end) {

    if(start>=end)
     return;
    int pivotIndex = partition(input,start,end);
    quickSort(input, start, pivotIndex-1);
    quickSort(input, pivotIndex+1, end);
  }
  public static int partition(int input[],int start,int end) {
    int pivot = input[start];

    int count=0;
    for(int i=start+1;i<=end;i++) {

      if(input[i]<=pivot)
      count++;
    }
    int pivotIndex = count+start;
    input[start] = input[pivotIndex];
    input[pivotIndex] = pivot;

    

    int i=start,j=end;
    while(i<pivotIndex && j>pivotIndex) {
      if(input[i]<=pivot)
         i++;
      else if(input[j]>pivot)
         j--;
      else {
        int tem = input[i];
        input[i]=input[j];
        input[j]=tem;
        i++;
        j--;
      }

    }
    return pivotIndex;
  }
  
}
