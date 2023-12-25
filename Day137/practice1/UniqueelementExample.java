import java.util.Arrays;

public class UniqueelementExample {

  public static void main(String[] args) {
    
    int a[] ={4,1,6,3,3,1,4};
    Arrays.sort(a); //1,1,3,3,4,4,6

    for(int i=1;i<a.length-1;i++) {
      if(a[0]!=a[1])
      System.out.print(a[0]+" ");
      if(a[i]!=a[i+1] && a[i-1]!=a[i])
      System.out.print(a[i]+" ");
    }
    if(a[a.length-1]!=a[a.length-2])
    System.out.println(a[a.length-1]);
  }
  
}
