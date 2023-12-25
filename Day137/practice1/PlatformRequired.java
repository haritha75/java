import java.util.Arrays;

public class PlatformRequired {
  public static void main(String[] args) {

    int arr[] ={900,940,950,1100,1500,1800};
    int dep[] = {910,1200,1120,1130,1900,2000};

   System.out.println( requiredPlatform(arr,dep));

  }

  public static int requiredPlatform(int arr[],int dep[]) {

    if(arr == null || dep==null || arr.length !=dep.length) 
    return 0;

    Arrays.sort(dep);

    int n = arr.length;
    int platformNeeded =0;
    int requiredPlatform =0;
    int i=0,j=0;

    while(i<n && j<n) {

      if(arr[i]<=dep[j]) {
        platformNeeded++;
        i++;
      }
      else {
        platformNeeded--;
        j++;
      }
      if(platformNeeded>requiredPlatform)
        requiredPlatform =platformNeeded;

    }

    return requiredPlatform;
  
  }

  
}
