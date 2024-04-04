import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();

      for(String s: strs){
          char arr[]=s.toCharArray();
          Arrays.sort(arr);
          String sortedString=String.valueOf(arr);
          if (!map.containsKey(sortedString)) {
              map.put(sortedString, new ArrayList<>());
          }
          map.get(sortedString).add(s);
      }
      return new ArrayList<>(map.values());
      
  }
}