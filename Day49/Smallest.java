//find out smallest value in large array.it is example brute force method
public class Smallest {
    public static void main(String[] args) {
        int a[]={99,23,66,12,77,88,34,66,22,7,33,56,90};
        int min=a[0];
        int c=0;
        for(int i=0;i<a.length;i++){
            c++;
            if(a[i]<min){
                   
                 min=a[i];
            }
        }        
        System.out.println(min);
        System.out.println(c);


    }
    
}
