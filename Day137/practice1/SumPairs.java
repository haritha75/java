import java.util.HashSet;

public class SumPairs {
  
   public static void main(String[] args) {
    
    int a[] = {11,15,6,8,9,10};
    int n = 16;
    boolean flag = true;

   HashSet<Integer> set = new HashSet();
   for(int i=0;i<a.length;i++) {
    set.add(a[i]);

   }
   for(int j=0;j<a.length;j++) {
    int d = n-a[j];
    if(set.contains(d)){
      System.out.println(a[j]+" "+d);
      flag = false;
      return;
    }
   }
   if(flag)
       System.out.println("No Such Pair");

  }
}
