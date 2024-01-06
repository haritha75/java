import java.util.Arrays;

public class ReturnSubsetsOFSum {


   public static void main(String[] args) {
     int a[] ={5,12,3,17,1,18,15,3,17};

   int anw[][] = subsetSum(a,6);


   for(int i=0;i<anw.length;i++) {
     System.out.println(Arrays.toString(anw[i]));
   }
   }
 
private static int[][] subsetSum(int a[],int k) {
   return findSubsetSum(a,0,k);
 }

 private static int[][]  findSubsetSum(int a[],int start,int k) {

   if(a.length==start) {
    if(k==0) {
     return new int[1][0];
    }
    else{
     return new int[0][0];
    }
   }

   int sampleoutput1[][] = findSubsetSum(a, start+1, k);
   int sampleoutput2[][] = findSubsetSum(a, start+1, k-a[start]);
   int output[][]= new int[sampleoutput1.length+sampleoutput2.length][];

   int index =0;

   for(int i=0;i<sampleoutput1.length;i++) {
     output[index++]  = sampleoutput1[i];
   }

   for(int i=0;i<sampleoutput2.length;i++) {
     output[index]=new int[sampleoutput2[i].length+1];
     output[index][0] = a[start] ;

     for(int j=0;j<sampleoutput2[i].length;j++) {
       output[index][j+1] = sampleoutput2[i][j];
     }
     index++;
   }

   return output;

 }

}