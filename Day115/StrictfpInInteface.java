public class StrictfpInInteface {

    public static void main(String[] args) {

            System.out.println(new Rock1().sum(4.89673234, 6.356123));

        
    }
    
}

strictfp interface Test { //all methods becomes implicitly strictfp when used during inheritance.

    double sum(double x,double y);

}
class Rock1 implements Test {

    public double sum(double d,double e) {
        return d+e;
    }

   
}