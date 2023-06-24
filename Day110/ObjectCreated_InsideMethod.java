import java.util.Stack;

public class ObjectCreated_InsideMethod {

    public static void main(String[] args) {

        rock(); //whenever calling the function variable will be created inside the heap after complete the rock method work that vairable removed from the heap.
        
    }
    static void rock() {

        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.push(22);
        stack.push(12);
        stack.push(96);
    }
    
}
