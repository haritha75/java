import java.util.HashSet;

public class HashSetEx {

  public static void main(String[] args) {
    
    int a[] = {5,20,3,2,50,80};
    int n = 78;
    boolean flag = true;

   HashSet<Integer> set = new HashSet();
   for(int i=0;i<a.length;i++) {
    set.add(a[i]);

   }
   for(int j=0;j<a.length;j++) {
    int d = a[j]+n;
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
