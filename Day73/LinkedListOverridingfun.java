    


import java.util.LinkedList;
public class LinkedListOverridingfun {


    public static void main(String[] args) {

        LinkedList<Duck> li = new LinkedList<>(); //here take not only wrapper classes and also takes reference type objects.hee duck is a reference type.

        Duck d1 = new Duck();
        d1.age = 21 ;
        d1.weight =54.7;

        Duck d2 = new Duck();
        d2.age = 23 ;
        d2.weight =54.7;

        Duck2 d3 = new Duck2();
        d3.age = 25 ;
        d3.weight =44.7;

        li.add(d1);
        li.add(d2);

        //li.add(d3); //here we want adding d3 because we are using reference type is duck class but d3 object is duck2 class .so it does not takes.

        System.out.println(li);
        System.out.println(li.toString()); //above also doing same work.its defaultly calling tostring function.

        System.out.println(li.get(0));



        


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