public class Array {
    public static void main(String[] args) {
        //print the fist repeating value in the arrat
        int arr[]={1,5,8,3,2,8,7,3,7,6,3,2,2,2,9,6,4,2,8,9,2,5,2};
         int a=2;
         int c=0;
         for(int i=0;i<arr.length;i++) {
            if(arr[i]==2){
                c++;
            }
        }
                System.out.println(c);
            
         }
}
