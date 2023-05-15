import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        

        Stack<Integer> li = new Stack<>();

        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        li.push(60); //it is used add the element to the stack.
       System.out.println( li.pop()); // it remove and returns the top element.
       System.out.println(li.peek()); // returns top element of stack.
       System.out.println(li.empty()); //it returns stack empty or not.
       System.out.println(li.search(40)); //it returns given element at which position.

       System.out.println(li.capacity()); //it returns capacity of thi vector
       System.out.println(li.hashCode());
       System.out.println(li.equals(40));
       System.out.println(li.isEmpty());
       System.out.println(li.indexOf(30)); //it returns index of first occurence of th specified element.
       System.out.println(li.lastIndexOf(50));
       System.out.println(li);

        

    }
    
}
