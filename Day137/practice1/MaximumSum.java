public class MaximumSum {

  public static void main(String[] args) {
    
    // int a[] ={1,5,8,12,20,25,30,35};
    // int b[] = {2,3,5,6,25};
    int a[] ={1,5,10,15,20,25};
    int b[] ={2,4,5,9,15};

    int i=0,j=0;

    int max =0;
     int sum1=0,sum2=0;
    while(i<a.length && j<b.length) {

     
      if(a[i]==b[j]) {
        sum1 +=a[i];
        sum2 +=b[j];
       max += Math.max(sum1,sum2);
       sum1=0;
       sum2=0;
        i++;
        j++;
      }
      else if(a[i]<b[j]) {
        sum1 +=a[i];
        i++;
      }
      else {
        sum2 +=b[j];
        j++;
      }
        
    }
    while(i<a.length) {
      max +=a[i];
      i++;
    }
    while(j<b.length) {
      max +=b[j];
      j++;
    }
    System.out.println(max);
  }
  
}
