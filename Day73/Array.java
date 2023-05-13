    
import java.util.LinkedList;

public class Array {


    public static void main(String[] args) {

        Duck[] li = new Duck[3];


        Duck d1 = new Duck();
        d1.age = 21 ;
        d1.weight =54.7;

        Duck d2 = new Duck();
        d2.age = 23 ;
        d2.weight =54.7;

        Duck d3 = new Duck();
        d3.age = 25 ;
        d3.weight =44.7;

        li[0] = d1;
        li[1] = d2;
        li[2] = d3;


        System.out.println(li);
        System.out.println(li.toString()); //above also doing same work.its defaultly calling tostring function.

        System.out.println(li[0]);



        


    }
}
class Duck extends Object {
    public int age;
    double weight;

    @Override

    public String toString() {
        return "Age: "+this.age+" weight: "+weight+"\n";
    }


}
class Duck2 {

    public int age;
    double weight;
}