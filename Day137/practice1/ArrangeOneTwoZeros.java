import java.util.Arrays;

public class ArrangeOneTwoZeros {

  public static void main(String[] args) {
    
    int a[] = {1,0,1,2,0,1,2,1,0};

    int ones=0,twos=0,zeros=0;
    for(int i=0;i<a.length;i++) {

      if(a[i]==0)
      zeros++;
      else if(a[i]==1)
      ones++;
      else
      twos++;
    }
   
    int k=0;
    for(int i=0;i<zeros;i++) {
      a[k++]=0;
    }
    for(int i=zeros;i<ones+zeros;i++)
    a[k++] = 1;
    for(int i=ones+zeros;i<a.length;i++)
    a[k++]=2;
    System.out.println(Arrays.toString(a));
  }
  
}
