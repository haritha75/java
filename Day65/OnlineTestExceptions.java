public class OnlineTestExceptions {

    public static void main(String[] args) {

        
        Test t = new Test();
        try {
           
            t.setMarks(50);
            System.out.println("you got 75% marks.So you passed online test");
        }
        catch(OnlineTestException e) {

            System.out.println(e);
        }

    }
    
}
class Test {

    private int marks;

    public int getMarks() {

        return marks;
    }

    public void setMarks(int a) throws OnlineTestException {

        if(a < 75) {
            throw new OnlineTestException("one more choice");
        }
        this.marks = a;
    }
}
class OnlineTestException extends RuntimeException {

    public OnlineTestException(String b) {

        super(b);
    }
}
