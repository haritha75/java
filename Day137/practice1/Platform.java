import java.util.Arrays;

public class Platform {

  public static void main(String[] args) {

    int arr[] ={900,940,950,1100,1500,1800};
    int dep[] = {910,1200,1120,1130,1900,2000};
    System.out.println(minPlatforms(arr,dep));

  
    
  }

  public static int minPlatforms(int arr[],int dep[]) {

    if(arr==null || dep == null || arr.length!=dep.length) {
      return 0;
    }
    Arrays.sort(dep);
    int n = arr.length;
    int platformNeeded =0,minplatofr =0;
    int i=0,j=0;
    while(i<arr.length && j<dep.length) {
      if(arr[i]<=dep[j]){
        platformNeeded++;
        i++;
      }
      else{
        platformNeeded--;
        j++;
      }
      if(platformNeeded>minplatofr)
      minplatofr = platformNeeded;
    }
    
    
    return minplatofr;
  }
  
}
