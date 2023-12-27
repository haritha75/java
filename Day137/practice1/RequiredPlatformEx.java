import java.util.ArrayList;
import java.util.List;

public class RequiredPlatformEx {

  public static void main(String[] args) {
    int[] arr = { 100, 300, 600 };
    int[] dep = { 900, 400, 500 };
    System.out.println(requiredPlatforms(arr,dep));
  }

  public static int requiredPlatforms(int arr[],int dept[]) {
    int n=arr.length;
    int count = 0, maxPlatforms = 0;

    int maxDepTime = dept[0];
    for (int i = 1; i < n; i++) {
        maxDepTime = Math.max(maxDepTime, dept[i]); //finding ma value in dept time
    }
    System.out.println(maxDepTime);

     List<Integer> list = new ArrayList<>(maxDepTime + 2);
        for (int i = 0; i < maxDepTime + 2; i++) {
            list.add(0);
        }

        for (int i = 0; i < n; i++) {
          list.set(arr[i], list.get(arr[i]) + 1);
          list.set(dept[i] + 1, list.get(dept[i] + 1) - 1);
      }
      for (int i = 0; i < maxDepTime + 2; i++) {
        count += list.get(i);
        maxPlatforms = Math.max(maxPlatforms, count);
    }

    return maxPlatforms;
  }
  
}
