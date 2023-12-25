import java.util.Arrays;

public class Chocklate1 {

  public static void main(String[] args) {
    
    int min = Integer.MAX_VALUE;

    // int a[] = {7,3,2,4,9,12,56};
    // int m=3;

    int a[]={3,4,1,9,56,7,9,12};
    int m=5;
    
    Arrays.sort(a); //2,3,4,7,9,12,56

    for(int i=0;i<a.length-m;i++) {

       int a1[] = new int[m];
       int k=0;
      for(int j=i;j<i+m;j++) {
         
          a1[k++]=a[j];

      }
      int mind = Math.abs(a1[0]-a1[a1.length-1]);
      if(min>mind)
        min = mind;

    }
    System.out.println(min);
  }
  
}
