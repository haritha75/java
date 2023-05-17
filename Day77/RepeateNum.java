public class RepeateNum {

    public static void main(String[] args) {
        
        int a[] = {5,8,9,2,6,2,7,2,1,2,0};
        int max=-1,maxVar=-1;
        for(int i=0;i<a.length;i++) {
            int currentEle = a[i];
            int count =0;
            for(int j=0;j<a.length;j++) {

                if(currentEle == a[j])
                count++;


            }
            if(count>max) {
                max=count;
                maxVar = currentEle;
            }
        }
        System.out.println(maxVar);
    }
    
}
