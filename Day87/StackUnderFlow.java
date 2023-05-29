import java.util.Stack;

//whenever do the operation on stack even if stack is empty that time it happens stackunderflow.
//whenever do the operation on empty statck it shows stackunderflow.
public class StackUnderFlow {

    public static void main(String[] args) {

        Stack<Integer> li = new Stack<>();
        li.add(90);
        li.add(33);
        li.add(65);
        System.out.println(li);
        System.out.println();

        li.pop();
        li.pop();
        li.pop();
        li.pop();

        System.out.println(li); //here happends stack underflow because we have three values in stack after we are removing three values then also do one more  pop operation then then it happens stackundeflow because their is no values in stack  and stack is empty.


    }
}
