import java.util.Arrays;
import java.util.HashSet;

public class PairWithDifference {

  public static void main(String[] args) {
    int a[] = {5,20,3,2,50,80};
    int diff = 78;
     int a1[] = {15,22,3,7,50,80};
     pairDiff3(a,diff);
    pairDiff(a,diff);
    pairDiff1(a1,diff);
    pairDiff2(a1,diff);
    
  }
  public static void pairDiff(int a[],int diff) {
    for(int i=0;i<a.length-1;i++) {
      for(int j=i+1;j<a.length;j++) {
       
          int dif = Math.abs(a[i]-a[j]);
          if(diff==dif) {
            System.out.println(a[i]+" "+a[j]);
            return;
        
          }
        } 
      }
    System.out.println("No Such Pair");
   
    
  }
 
  public static void pairDiff1(int a[],int diff) {

    HashSet<Integer> set = new HashSet();
    for(int i=0;i<a.length;i++) {
      set.add(a[i]);
    }
    for(int i=0;i<a.length;i++) {
      int dif = diff-a[i];
      if(set.contains(dif)){
        System.out.println(a[i]+" "+dif); 
        return;
      }
    }
    System.out.println("No Such Pair");
  }
   public static void pairDiff2(int a[],int diff) {

    HashSet<Integer> set = new HashSet();
    
    for(int i=0;i<a.length;i++) {
      int dif = diff-a[i];
      if(set.contains(dif)) {
        System.out.println(a[i]+" "+dif); 
        return;
      }
       else 
         set.add(a[i]); 
    }
    System.out.println("No Such Pair");
  }


  public static void pairDiff3(int a[],int diff) {

    Arrays.sort(a);
    int i=0,j=1;
    while(i<a.length && j<a.length) {

      if(i!=j && (a[i]-a[j]==diff) || (a[j]-a[i]==diff)){
        System.out.println(a[i]+" "+a[j]);
        return;
      }
      else if(a[j]-a[i]<diff)
         j++;
     else 
        i++;    
    }
    System.out.println("no such Pair");
  }

  
}
