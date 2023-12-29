public class printWaveLike {

  public static void main(String[] args) {
    
    int a[][] = {
      {1,2,3,10},
      {4,5,6,11},
      {7,8,9,12}
    };

    for(int i=0;i<a[0].length;i++) { //how many column we want print take like this here we want to print oclumn wise that's why i am taking like this
      if(i%2==0) {

          for(int j=0;j<a.length;j++) {
            System.out.print(a[j][i]+" ");
          
        }
      }
      else {
        for(int h=a.length-1;h>=0;h--) {
          
            System.out.print(a[h][i]+" ");
          }
        }
      }
    }
  }
  

