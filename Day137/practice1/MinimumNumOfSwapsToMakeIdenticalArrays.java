import java.util.Arrays;

public class MinimumNumOfSwapsToMakeIdenticalArrays {

  public static void main(String[] args) {
    int a1[] = {3,6,4,8};
    int a2[] = {4,6,8,3};

    for(int i=0;i<a1.length;i++) {
      if(a1[i]!=a2[i]) {
        for(int j=i+1;j<a1.length;j++) {
          if(a1[i]==a2[j]) {
            int temp = a2[i];
            a2[i]=a2[j];
            a2[j]=temp;
          }
        }
      }
    }
    System.out.println(Arrays.toString(a2));
  }
  
}
