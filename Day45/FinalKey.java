public class FinalKey { final int x = 10;

    public static void main(String[] args) { FinalKey myObj = new FinalKey();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
    }
    }