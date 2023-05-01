public class Rock {

    public static void main(String[] args) {
        
        MyBigInteger n = new MyBigInteger("123");

        n.print(); //we are calling print method.
    }
    
}
class MyBigInteger {

    String value;

    MyBigInteger(String a) { // first we are passing 123

        this.value = a;
    }

    void print() {

        MyBigInteger  m = new MyBigInteger("895"); //then passing 895

        System.out.println(m.value);

        m = new MyBigInteger("742"); //here we are changing again a value
        
        System.out.println(m.value); //finally value printing.
    }
}