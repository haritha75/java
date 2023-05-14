import java.util.*;
public class LinkedList11 {

    public static void main(String[] args) {
        

        LinkedList lan = new LinkedList<>();

        lan.add("telugu");
        lan.add("english");
        lan.add("hindi");

        System.out.println(lan.peek()); // it access the first lement
        System.out.println(lan.peekFirst());
        System.out.println(lan.peekLast());

        System.out.println(lan.poll()); //it acess and remove the first element
        System.out.println(lan.pollFirst());
        System.out.println(lan.pollLast());
        System.out.println(lan.offer("kannada")); //it add element at the end
        System.out.println(lan.contains("kannada")); //it checks given string contains  or not.
        System.out.println(lan.indexOf("telugu")); //returns the index of the first occurrence of the specified element in this list
        System.out.println(lan.lastIndexOf(90)); // It returns the index of the last occurrence of the specified element in this list

        System.out.println(lan);
    }
    
}
