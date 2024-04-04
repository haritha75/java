class Solution {
  public String countAndSay(int n) {
      if(n == 1){
          return "1";
      }
      String t = countAndSay(n - 1);
      StringBuilder stringBuilder = new StringBuilder();
      int counter = 1;
      char lastInteger = t.charAt(0);
      for(int i = 1; i < t.length(); i++){
          if(t.charAt(i) == t.charAt(i-1)){
              counter++;
          }else{
              stringBuilder.append(counter).append(lastInteger);
              lastInteger = t.charAt(i);
              counter = 1;
          }
      }
      stringBuilder.append(counter).append(lastInteger);
      return stringBuilder.toString();
      
  }
}