import java.util.HashMap;
public class SumOfTwoNum {

    public static void main(String[] args) {
        
        int a[] = {6,9,4,2,1,3,7,0,};

        int target = 8;
        HashMap<Integer,String>  set = new HashMap<>();

        for(int i=0;i<a.length;i++) {
            set.put(a[i],"x");
        }

        for(var x: set.keySet()) {

            int current = x;
             int t = target -  current;

             if(set.containsKey(t)) {

                System.out.println(x+" + "+t+" = "+target);
                return;
             }
        }
    }
    
}
