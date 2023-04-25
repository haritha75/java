public class EvenAndOddCLA { 

    public static void main(String[] args) {
        

        for (var x:args) {

            int s = Integer.parseInt(x);

            if(s%2==0) 
              System.out.println("Even " +s);
            else
              System.out.println("Odd "+s);  
        }
    }
    
}
