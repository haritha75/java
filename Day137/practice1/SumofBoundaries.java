public class SumofBoundaries {

  public static void main(String[] args) {
    
    int a[][] = { //1+2+3+6+9+8+7+4 = 40
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

    int sum =0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[0].length;j++) {
        if(i==0 || i==a.length-1 ||j==0 || j==(a[i].length-1) ) {
          System.out.println(a[i][j]);
            sum +=a[i][j];
        }
      }
    }
    System.out.println(sum);
  }

  
}
