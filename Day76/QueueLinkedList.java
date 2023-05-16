
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//linked list implements list,queue and dequeue interfaces.
//but here we implementing only queue. interface with linked list class.
public class QueueLinkedList {

    public static void main(String[] args) {
        
        Queue<Integer> li = new LinkedList<>();

        li.add(50);
        li.add(90);
        li.add(40);

        System.out.println(li);
        System.out.println(li.remove());
         System.out.println(li.peek());
          System.out.println(li.element());
          System.out.println(li.poll());
          System.out.println(li.contains(40));
          System.out.println(li.isEmpty());
          System.out.println(li.offer(33));
          System.out.println(li);

          Iterator<Integer> li1 = li.iterator();
          while(li1.hasNext()) { //it checks next element is availble or not
              System.out.println(li1.next()); //it print next element.
          }            
          

          




    }
    
}
