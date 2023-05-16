import java.util.ArrayDeque;
import java.util.Iterator;

//queue is a interaface.linked list, priority queue and arraydeque will be implements the queue.

//arraydequeue implements both queue and dequeue methods.
import java.util.ArrayDeque;
import java.util.Queue;
public class Queue1 {

    public static void main(String[] args) {
        
        Queue<Integer> li = new ArrayDeque<>();

        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(99);
        li.add(60);

        li.remove(); //it removes first element in the queue.
        li.offer(54); //it adds the element to the queue


        System.out.println(li);
        System.out.println(li.poll()); //it remove first element and returns that element.
        System.out.println(li);
        System.out.println(li.element()); //it returns first element in the queue.
        System.out.println(li.peek()); //it also same like a element method.

        System.out.println(li);
        li.contains(30);
       // li.clear(); //it clears all elements in the queue.
        System.out.println(li.isEmpty());
        System.out.println(li.contains(44));
        System.out.println(li.size());
        System.out.println(li);

        Iterator li1 = li.iterator();

        while(li1.hasNext())

         { 
            System.out.println(li1.next()); //it print next element.
        }
        System.out.println(li);
    }
}