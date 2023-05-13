import java.util.LinkedList;

//linked list accept all datatype type at a time but arratlist accept only one datatype at a time.
public class LinkedListFunctions {


    public static void main(String[] args) {
        
        LinkedList li = new LinkedList();

        li.add(23);
        li.add(89.56);
        li.add("haritha");
        li.add(true);

        li.addFirst(44.6);
        li.addLast(90);

        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        System.out.println(li.get(3));


        li.remove(3);
        li.removeFirst();
        li.removeLast();

        System.out.println();

        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        System.out.println(li.get(2));

    }
    
}
