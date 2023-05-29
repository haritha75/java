import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//dequeue nothing but adding and removing the elements from the both ends.
//whenever do the  dequeue operations  on queue it will not working.brecause queue not adding and removing the values from the both ends it do the operations on one end only.
public class Dequeue1 {

    public static void main(String[] args) {

        Deque<Integer>  deque = new ArrayDeque<>();

        deque.add(20);
        deque.add(50);
        deque.addFirst(70);
        deque.addLast(77);


        System.out.println(deque);

        deque.remove();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

    }
}
