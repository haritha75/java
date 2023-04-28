public class Modulo2 {
    
    public static void main(String[] args) {
        
        long num = 4349734709439l;

        long num1 = 54770904398l;

        long m=1000000007; //10^9+7

        long sum = (num%m)+(num1%m);
        

        System.out.println(sum);
    }

}