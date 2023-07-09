public class ThreadsExample {


    public static void main(String[] args) {

        Rock r1 = new Rock();
        Duck d1 = new Duck();

        Thread t1 = new Thread(r1); 
        Thread t2 = new Thread(d1);
        t1.start();
        t2.start();
        
    }
}
class Rock implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Rock");
        }

    }
}
class Duck implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Duck");
        }
    }
}