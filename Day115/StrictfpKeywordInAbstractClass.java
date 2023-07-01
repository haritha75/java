public strictfp class StrictfpKeywordInAbstractClass { //use strictfp keyword in normal class also then all concrete method are implicitly strictfp.

    public static void main(String[] args) {

                       System.out.println( new Joke().hello(6.97999987 ));
        
    }
}
 abstract  strictfp class Shock { //apply strictfp keyword in abstract class but not abstract method.
    abstract double hello(double x);

 }
 class Joke extends Shock {

    double hello(double x) {
        System.out.println("hello......");
        return x;
    }

 } 