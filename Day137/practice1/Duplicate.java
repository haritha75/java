import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {

  public static void main(String[] args) {
    
    int a[] = {2,4,0,4,3,1};
    HashSet<Integer> set = new HashSet<>();

    for(int i=0;i<a.length;i++) {
      if(set.contains(a[i])) {
        System.out.println(a[i]);
        return;
      }
      else {
        set.add(a[i]);
      }
    }
  }
  public static void Duplicateelement(int a[])  {
    Arrays.sort(a); //0,1,2,2,4,3

    for(int i=1;i<a.length-1;i++) {

      if(a[0]==a[1]){
        System.out.println(a[i]);
        return;
      }
      if(a[i]==a[i+1]|| a[i-1]==a[i]) {
        System.out.println(a[i]);
        return;
      }
      if(a[a.length-1]==a[a.length-2])
      System.out.println(a[a.length]);

        
      


    }
    
  }

  
}
