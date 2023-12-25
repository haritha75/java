import java.util.Arrays;

public class RotatedArray {

  public static void main(String[] args) {
    

    int a[] = {2,6,3,1,5,9,8};
    int noOfRotates = 2;

    // for(int i=0;i<noOfRotates;i++) {
    //   int temp =a[0];
    //   for(int j=0;j<a.length-1;j++) {
    //     a[j]=a[j+1];
    //   }
    //   a[a.length-1]=temp;
    // }

    // System.out.println(Arrays.toString(a));

    //another appoach

    int a1[]=new int[noOfRotates];
    for(int i=0;i<noOfRotates;i++) {
      a1[i]=a[i];
    }
    int j,k=0;

    for( j=0;j<a.length-noOfRotates;j++) {
      a[j]=a[j+noOfRotates];
    }

    for(int h=0;h<a1.length;h++) {

      a[j++]=a1[h];
    }

    System.out.println(Arrays.toString(a));
  }
  

  

  
}
