public class LambdaFun4 {

    public static void main(String[] args) {

        PI1 p = r -> Math.PI*(r*r);  //area of circle formula 

        System.out.println(p.say(5));
        
    }
    
}
@FunctionalInterface

interface PI1 {

    double say(int r);


}