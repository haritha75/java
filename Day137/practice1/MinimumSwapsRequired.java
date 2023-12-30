import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwapsRequired {

  public static void main(String[] args) {
    int a1[] = {3,6,4,8};
    int a2[] = {4,6,8,3};

    minimumSwaps(a1,a2);
  }

  public static void minimumSwaps(int a1[],int a2[]) {

    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<a2.length;i++) 
      map.put(a2[i],i); //here passing index and element
    

    for(int i=0;i<a2.length;i++) 
      a2[i] = map.get(a1[i]); //here storing index to the a2
     
    
     System.out.println(minSwap(a2));
  }

    public static int minSwap(int a[]) {

          Map<Integer,Integer> map = new HashMap<>();

          for(int i=0;i<a.length;i++) 
            map.put(a[i],i); //here again we are storing a2 values to the map that means in a2 we have indexes

          Arrays.sort(a);   //here  indexes 

          int swaps =0;
          boolean visited[] = new boolean[a.length];

          for(int i=0;i<a.length;i++) {
            if(visited[i] || a[i]==map.get(a[i]))
              continue;
            else{
              int j=i+1;
              int cyleSize = 0;
              while(!visited[j]) {
                visited[j]=true;
                j=map.get(a[j]);
                cyleSize++;
              }
              if(cyleSize>0) {
                swaps +=cyleSize-1;
              }
            }  
          }
          return swaps;

    } 
  
}
