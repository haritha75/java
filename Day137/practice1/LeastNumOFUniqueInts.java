import java.util.*;

class Solution {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Integer> ls = new ArrayList<>(map.values());
        Collections.sort(ls);

        int size = map.size();
        for(int n : ls){
            if(n < k) {
                size--;
                k -= n;
            }
            else if( k == n) {
                size--;
                k -= n;
            }
            else {
                break;
            }
        }
        return size;
    }
}