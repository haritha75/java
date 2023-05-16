import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;

//here we implementing queue using priorityqueue class.

public class QueuePriorityQueue {

    public static void main(String[] args) {
        

        Queue<Integer> li = new PriorityQueue<>();

        li.add(50);
        li.add(33);
        li.add(54);
        li.add(12);
        li.add(3);
        System.out.println(li);
        System.out.println(li.peek());
        System.out.println(li.isEmpty());
        System.out.println(li.poll());
        System.out.println(li.remove());
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.getClass());
        System.out.println(li.isEmpty());
        System.out.println(li.offer(70));
        System.out.println(li.contains(55));
        System.out.println(li);

        Iterator<Integer> li1 = li.iterator();
        while(li1.hasNext()) { //it checks next element is availble or not
            System.out.println(li1.next()); //it print next element.
        }

    }
    
}
