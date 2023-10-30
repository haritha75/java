public class Sample2 {
       static int i=10;
    public static void main(String[] args) {
              changeValue(i);
              System.out.println(i); //here print 10 because we are changing the value with the scope only not outside
              change(i);
              System.out.println(i);

        
    }

    public static void changeValue(int i) {
        i=50; //here it will use only with in the scope
    }

    public static void change(int x) {
        i=15; //here we are change the main value means reassigning the new value.
    }
    
}
