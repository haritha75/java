
import java.util.Arrays;

public class MergeSortEx {

  public static void main(String[] args) {
    
    int a[] = {6,5,4,3,2,1};
    mergeSort(a, 0, a.length-1);
    System.out.println(Arrays.toString(a));
  }

  public static void mergeSort(int a[], int start, int end) {

    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    mergeSort(a, start, mid);
    mergeSort(a, mid + 1, end);
    merge(a, start, end);
  }

  public static void merge(int a[], int start, int end) {

    int size = end - start + 1;
    int mid  = (start + end) / 2;

    int out[] = new int[size];

    int i = start;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= end) {
      if (a[i] < a[j]) {
        out[k++] = a[i++];
      } else {
        out[k++] = a[j++];
      }
    }

    while (i <= mid) {
      out[k++] = a[i++];
    }

    while (j <= end) {
      out[k++] = a[j++];
    }

    // Copy the sorted array back to the original array
    for (i = 0; i < size; i++) {
      a[start + i] = out[i];
    }
  }
}
