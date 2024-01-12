public class CommonPrefix {

  public static void main(String[] args) {

    String arr[] = {"apple", "ape", "april"};

    int n = arr.length;
    String ans = commonPreFix(arr,0,n-1);

    if(ans.length()!=0) {
      System.out.println(ans);
    }
    else{
      System.out.println("their is no common prefix");
    }
    
    

  }

  private static String commonPreFix(String[] arr, int i, int j) {
    if(i==j) {
      return arr[i];
    }

    if(j>i) {
      int mid = (i+j)/2;

      String str1 = commonPreFix(arr, i, mid);
      String str2 = commonPreFix(arr, mid+1, j);

      return (commonPrefixUtill(str1,str2));


    }

    return null;
  }

  private static String commonPrefixUtill(String str1, String str2) {
  String result = "" ;

  int n1=str1.length();
  int n2 = str2.length();

  for(int i=0,j=0;i<n1 && j<n2 ;i++,j++) {

    if(str1.charAt(i) !=str2.charAt(j)) {
      break;
    }

    result +=str1.charAt(i);
  }

  return result;
  }


  
}
