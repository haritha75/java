public class Modulo {
    
    public static void main(String[] args) {
        
        long num = 2349534709439l;

        long num1 = 34870904398l;

        long m = 1000000007l;

        long sum = (num%m) + (num1%m);
        

        System.out.println(sum);

        long sub = (num%m) - (num1%m);

        System.out.println(sub);

        long mul = (num%m) * (num1%m);

        System.out.println(mul);

        long div = (num%m)/(num1%m); // we can't perform division, it will generate wrong answer
    
        System.out.println(div);
    }

}