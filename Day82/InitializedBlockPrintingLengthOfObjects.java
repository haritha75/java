    //here count will be repeating more times if you apply dry priciple in dry priciples we have a rule that is donot repeat youself.so that's why reducing duplicates using initilized blocks.
public class InitializedBlockPrintingLengthOfObjects {

    public static void main(String[] args) {

        Nock n = new Nock();
        Nock n1 = new Nock("haritha");
        Nock n2 = new Nock();
        Nock n3 = new Nock("ramya");

        System.out.println(Nock.getCount());
        

    }
    
}

class Nock {

    private static int count;

    private int age;

    String name;

    {
        System.out.println("it will excuted every time whenever calling class with different objects so it will be counting how many times");
        count++; //this is intialized block. with the help of initialized block reducing duplicates and code size.here every time intilized block will be excuted.if one time empty  and other time excuted other constructor  but every time intilized block will excuted it will count how many objects have.
    }

    public Nock() {

        
    }

    public Nock(String name) {

        this.name = name;
        

    }

    public static int getCount() {
        return count;
    }

    public Nock(String name, int age) {

        this.age = age;
        
    }

}