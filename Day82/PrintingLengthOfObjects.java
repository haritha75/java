//here count will be repeating more times if you apply dry priciple in dry priciples we have a rule that is donot repeat youself.so that's why reducing duplicates using initilized blocks.
public class PrintingLengthOfObjects {

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

    public Nock() {

        count++;

    }

    public Nock(String name) {

        this.name = name;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public Nock(String name, int age) {

        this.age = age;
        count++;
    }

}