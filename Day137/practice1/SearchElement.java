import java.util.Arrays;

public class SearchElement {

  public static void main(String[] args) {
    
    int a[] ={5,6,7,8,9,10,1,2,3};
    int key = 3;
    for (int i = 0; i < a.length; i++) {
      if(a[i]==key){
        System.out.println(i);
        return;
      }
      
    }

   
  }
  
}
