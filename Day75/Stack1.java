
    


import java.util.Stack;
public class Stack1 {

    public static void main(String[] args) {

        Stack<Duck> li = new Stack<>(); //here take not only wrapper classes and also takes reference type objects.hee duck is a reference type.

        Duck d1 = new Duck();
        d1.age = 21 ;
        d1.weight =54.7;

        Duck d2 = new Duck();
        d2.age = 23 ;
        d2.weight =54.7;

        Duck d3 = new Duck();
        d3.age = 25 ;
        d3.weight =44.7;

        li.push(d1);
        li.push(d2);
        li.push(d3);
        li.pop(); //it remove top element in stack.
        li.peek(); //it returns top element of the stack.
        
        


        System.out.println(li);
        System.out.println(li.toString()); //above also doing same work.its defaultly calling tostring function.

        System.out.println(li.search(d2)); //it return which position given object.
        System.out.println(li.empty());



        


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