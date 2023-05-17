    

import java.util.HashMap;
public class RepeatVa1InHas {


    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int a[] = {3,6,8,9,3,5,6,8,8,2,8,9,0,8,4};

        for(int i=0;i<a.length;i++) {
            if(!map.containsKey(a[i])) {
                map.put(a[i],1);
            }
            else {
                int preVal = map.get(a[i]);
                map.put(a[i],preVal+1);
            }
        }
        System.out.println(map);


        //another method

        int count =-1,key =-1;
        for(var x:map.entrySet()) {
            if(x.getValue()>count){

            count = x.getValue();
            key = x.getKey();
            
        }
    }
    System.out.println(key);
    }
    
}
