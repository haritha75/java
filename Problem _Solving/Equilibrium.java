import java.util.Scanner;

public class Equilibrium {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextLong();
        int res=equilibriumPoint(a, n);
        System.out.println(res);
    }

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum=0;
        int sum1=0;
        int j=n-1;
        int count=0;
        for(int i=0;i<n/2;i++) {
            count++;
            sum +=arr[i];
            sum1 +=arr[j];
            j--;
            if(sum==sum1) 
           // System.out.println(sum);
            return count+1;
           
        }
        return -1;
    }
    
}
