public class Brute2 {
    
    static  int a[][]={
         {1,2,3,2},
         {4,5,6,1},
         {7,8,9,5},
         {3,6,9,8}
 
         
     };
     public static void main(String[] args) {
            
     boolean res=isMagicSquare();
     
        System.out.println(res);

     }
 
 public static boolean isMagicSquare() {
     int sum=a[0][0]+a[0][1]+a[0][2]+a[0][3];
 
     //compare rows
     for(int i=0;i<4;i++) {
 
         if(a[i][0]+a[i][1]+a[i][2]+a[i][3]!=sum)
         return false;
      }
  
 
     //compare cols
 
     for(int i=0;i<4;i++) {
 
        if(a[0][i]+a[1][i]+a[2][i]+a[3][i]!=sum)
        return false;
     }
     
     return(a[0][0]+a[1][1]+a[2][2]+a[3][3]==sum&&a[0][3]+a[1][2]+a[2][1]+a[3][0]==sum);
 }
 
 
}
 
 
 
 
 
 
 
 