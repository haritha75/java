public class ThreadExample {

    public static void main(String[] args) {

        Rock r1 = new Rock();
        Mock m1 = new Mock();
        r1.start();
        m1.start();
        
    }
    
}
class Rock extends Thread {

    @Override
    public void run() {

        for(int i=0;i<100;i++) {
            System.out.println("Rock");
        }
    }
}
class Mock extends Thread {

    @Override
    public void run() {
            for(int k=0;k<100;k++) {
                System.out.println("Duck");

            }
        }
    }
