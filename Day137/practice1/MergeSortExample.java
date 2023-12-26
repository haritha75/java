import java.util.Arrays;

public class MergeSortExample {

  public static void main(String[] args) {
    
    int a[] = {8,1,4,3,9,2,7};
     mergeSort(a);
     System.out.println(Arrays.toString(args));
  }
  public static void mergeSort(int a[]) {

    if(a.length<=1)
    return;

    int mid =(0+a.length-1)/2;
    int part1[] = new int[mid+1];
    int part2[] = new int[a.length-(mid+1)];

    for(int i=0;i<part1.length;i++) {
      part1[i] = a[i];
    }
    int tem = mid+1;
    for(int i=0;i<part2.length;i++) {
      part2[i]=a[tem++];

    }
    mergeSort(part1);
    mergeSort(part2);
    merge(part1,part2,a);


  }
  public static void merge(int part1[], int part2[], int output[]) {
    int i = 0, j = 0, k = 0;

    while (i < part1.length && j < part2.length) {
        if (part1[i] < part2[j]) {
            output[k++] = part1[i++];
        } else {
            output[k++] = part2[j++];
        }
    }

    while (i < part1.length) {
        output[k++] = part1[i++];
    }

    while (j < part2.length) {
        output[k++] = part2[j++];
    }
}
  
}
